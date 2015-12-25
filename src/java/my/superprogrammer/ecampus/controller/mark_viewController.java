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
import my.superprogrammer.ecampus.model.Studentrecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/mark_view.htm")
public class mark_viewController {
    
    EntityManagerFactory factory;
    int status = 1;
    String pcode2;
    
    @RequestMapping(method = RequestMethod.GET)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String processForm(ModelMap map, String pcode) throws Exception {
      factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        pcode2=pcode;
        try {
            em.getTransaction().begin();

            List applicantList = em.createQuery("SELECT a FROM Applicant a"
                    + " WHERE a.pcodeApplicant = :pcodeApplicant"
                    + " AND a.statusApplicant = :statusApplicant")
                    .setParameter("pcodeApplicant", Integer.parseInt(pcode))
                    .setParameter("statusApplicant", status)
                    .getResultList();

            map.put("applicantList", applicantList);

            return "mark_view";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String insertMark(ModelMap map, String id, String mquiz, String masgmnt, String mfinal) throws Exception {

        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();

        Studentrecord insertMarkForm = null;

        try {

            em.getTransaction().begin();
            
            List recordsList = em.createQuery("SELECT s FROM Studentrecord s"
                    + " WHERE s.applicantIDsr = :applicantIDsr")
                    .setParameter("applicantIDsr", Integer.parseInt(id))
                    .getResultList();

            if (recordsList.size() == 1) {
                insertMarkForm = (Studentrecord) recordsList.get(0);

            } else {
                insertMarkForm = new Studentrecord();
            }

            insertMarkForm.setFinalSr(Float.parseFloat(mfinal));
            insertMarkForm.setQuizSr(Float.parseFloat(mquiz));
            insertMarkForm.setAssesmentSr(Float.parseFloat(masgmnt));
            
            insertMarkForm.setApplicantIDsr(Integer.parseInt(id));

            em.persist(insertMarkForm);

            em.getTransaction().commit();

            return "redirect:/mark_view.htm?pcode="+pcode2;

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }

    }

}
