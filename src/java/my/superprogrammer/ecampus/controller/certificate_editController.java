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
@RequestMapping(value = "/certificate_edit.htm")
public class certificate_editController {
    EntityManagerFactory factory;  
     
    @RequestMapping(method = RequestMethod.POST)
    public String processForm(ModelMap map, String aname, String pcode, String nric, String startdate, String enddate)
            throws Exception {
    String pcode2=pcode;
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
                //say already applied n quit
            } else {
                
            }

            applyForm.setNameApplicant(aname);
            applyForm.setStartDateapplicant(startdate);
            applyForm.setStartDateapplicant(enddate);  
     
            em.persist(applyForm);

            em.getTransaction().commit();

            return "redirect:/certificate_view.htm?pcode="+pcode2; 

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }
        
    }
    
@RequestMapping(method = RequestMethod.GET)
    public String displayForm(ModelMap map, String appID) throws Exception {
        
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        
        try {
            em.getTransaction().begin();
        
            List myList = em.createNamedQuery("Applicant.findByApplicantIDapplicant")
                    .setParameter("applicantIDapplicant", Integer.parseInt(appID))
                    .getResultList();
            
            map.put("myList", myList);
            
            return "certificate_edit";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }
    
    

}
   