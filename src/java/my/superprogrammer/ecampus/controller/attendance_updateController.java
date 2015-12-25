/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.superprogrammer.ecampus.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import my.superprogrammer.ecampus.model.Applicant;
import my.superprogrammer.ecampus.model.Attendance;
import my.superprogrammer.ecampus.model.Programme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/attendance_update.htm")
public class attendance_updateController {

    EntityManagerFactory factory;
    int status = 1;
    short zero = 0;
    String pcode2;

    @RequestMapping(method = RequestMethod.GET)
    public String attendanceForm(ModelMap map, String pcode) throws Exception {
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        pcode2=pcode;
        try {
            em.getTransaction().begin();
//header
            List progAttendance = em.createNamedQuery("Programme.findByProgCodeIDprogramme")
                    .setParameter("progCodeIDprogramme", Integer.parseInt(pcode))
                    .getResultList();

            map.put("progAttendance", progAttendance);
        //table    
            List applicantList = em.createQuery("SELECT a FROM Applicant a"
                    + " WHERE a.pcodeApplicant = :pcodeApplicant"
                    + " AND a.statusApplicant = :statusApplicant")
                    .setParameter("pcodeApplicant", Integer.parseInt(pcode))
                    .setParameter("statusApplicant", status)
                    .getResultList();

            map.put("applicantList", applicantList);
            
            //table    
            /*List applicantList = em.createQuery("SELECT ap, att FROM Applicant ap"
                    + " LEFT JOIN Attendance att ON ap.applicantIDapplicant = att.applicantIDattendance"
                    + " WHERE ap.pcodeApplicant = :pcodeApplicant"
                    + " AND ap.statusApplicant = :statusApplicant")
                    
                    .setParameter("pcodeApplicant", Integer.parseInt(pcode))
                    .setParameter("statusApplicant", status)
                    .getResultList();

            map.put("applicantList", applicantList);*/
            
                       return "attendance_update";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

    @RequestMapping(method = RequestMethod.POST)
    public String registerStudent(ModelMap map, String id, String week1
            , String week2, String week3, String week4) throws Exception {

        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();

        Attendance attendanceForm = null;
        String attID = id;

        try {

            em.getTransaction().begin();

            List applicantList = em.createQuery("SELECT a FROM Attendance a"
                    + " WHERE a.applicantIDattendance = :applicantIDattendance")
                    .setParameter("applicantIDattendance", Integer.parseInt(attID))
                    .getResultList();

            if (applicantList.size() == 1) {
                attendanceForm = (Attendance) applicantList.get(0);

            } else {
                attendanceForm = new Attendance();
            }

            attendanceForm.setWeek1Attendance(Short.parseShort(week1));
            attendanceForm.setWeek2Attendance(Short.parseShort(week2));
            attendanceForm.setWeek3Attendance(Short.parseShort(week3));
            attendanceForm.setWeek4Attendance(Short.parseShort(week4));
            
            attendanceForm.setApplicantIDattendance(Integer.parseInt(attID));

            em.persist(attendanceForm);

            em.getTransaction().commit();

            return "redirect:/attendance_update.htm?pcode="+pcode2;

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }

    }

}
