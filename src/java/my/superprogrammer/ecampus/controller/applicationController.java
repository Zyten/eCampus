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
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author zyten
 */
@Controller
@RequestMapping(value = "/application.htm")
public class applicationController {

    EntityManagerFactory factory;

    @RequestMapping(method = RequestMethod.POST)
    /*    public String processForm(ModelMap map, 
     @RequestParam(required = true) String uname,  //retrive input from from
     @RequestParam(required = true) String pwd) throws Exception { */
    public String processForm(ModelMap map, String aname, String nric, String race
            ,String phone, String email, String address, String edulvl
            ,String insti, String lresult, String course) throws Exception {

        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();

        Applicant applyForm = null;

        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("User.findByNricUser")
                    .setParameter("nricUser", nric)
                    .getResultList();

            if (result.size() == 1) {
                return "dashboard";
                //say already applied n quit
            } else {
                applyForm = new Applicant();
            }

            applyForm.setNameApplicant(aname);
            applyForm.setNricApplicant(nric);
            applyForm.setRaceApplicant(race);
            applyForm.setPhoneApplicant(phone);  
            applyForm.setEmailApplicant(email);
            applyForm.setAddressApplicant(address);
            applyForm.setEdulvlApplicant(edulvl);
            applyForm.setInstitutionApplicant(insti);
            applyForm.setResultApplicant(lresult);
            applyForm.setPcodeApplicant(Integer.parseInt(course));
            
            
            em.persist(applyForm);

            em.getTransaction().commit();

            return "application"; 

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }

    }

    @RequestMapping(method = RequestMethod.GET)
    public String displayPortal() throws Exception {

        try {
            return "application"; //simulate clicking link?
        } catch (Exception ex) {

            throw new Exception(ex.getMessage());
        }
    }
    
    
}
