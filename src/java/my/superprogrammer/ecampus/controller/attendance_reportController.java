
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
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import my.superprogrammer.ecampus.model.Applicant;
import my.superprogrammer.ecampus.model.Attendance;



/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/attendance_report.htm")
public class attendance_reportController {

    EntityManagerFactory factory;
    //int status = 1;

    @RequestMapping(method = RequestMethod.GET)
    public String processReport(ModelMap map, String pcode) throws Exception {
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();

        try {
            em.getTransaction().begin();

                        List applicantList = em.createQuery("SELECT a FROM Applicant a"
                    + " WHERE a.pcodeApplicant = :pcodeApplicant")
                    .setParameter("pcodeApplicant", Integer.parseInt(pcode))
                    .getResultList();
            
            
            map.put("applicantList", applicantList);

            return "attendance_report";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }

}
