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
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/registration_view.htm")
public class registration_viewController {
        EntityManagerFactory factory;  
    
    @RequestMapping(method = RequestMethod.GET)

    public String processForm(ModelMap map, String appID) throws Exception {
         factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        try {
            
             List myList = em.createNamedQuery("Applicant.findByApplicantIDapplicant")
                    .setParameter("applicantIDapplicant", Integer.parseInt(appID))
                    .getResultList();
            
            map.put("myList", myList);
            
             return "registration_view";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String registerStudent(ModelMap map, String approve, String nric) throws Exception {

        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();

        Applicant applyForm = null;

        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("Applicant.findByNricApplicant")
                    .setParameter("nricApplicant", nric)
                    .getResultList();

            if (result.size() == 1) {
                applyForm = (Applicant) result.get(0);
               
            } else {
                
            }

            applyForm.setStatusApplicant(Integer.parseInt(approve));
    
            em.persist(applyForm);

            em.getTransaction().commit();
            if(Integer.parseInt(approve) == 1)
                return "registration_approve"; 
            else if (Integer.parseInt(approve)==2)
                return "registration_decline";
            else
                return "registration";

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }

    }


}
