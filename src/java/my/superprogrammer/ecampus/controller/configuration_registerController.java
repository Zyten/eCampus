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
import my.superprogrammer.ecampus.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/configuration_register.htm")
public class configuration_registerController {
    
    EntityManagerFactory factory;
    
    @RequestMapping(method = RequestMethod.POST)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String registerForm(ModelMap map, String uname, String fname, String nric, String email, String acslvl) throws Exception {
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        
        Admin programmeForm = null;

        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("Admin.findByNricadmin")
                    .setParameter("nricadmin", nric)
                    .getResultList();

            if (result.size() == 1) {
                return "redirect:errorPopup.htm";
            } else {
                programmeForm = new Admin();
            }

            programmeForm.setUsernameAdmin(uname);
            programmeForm.setNameadmin(fname);
            programmeForm.setNricadmin(nric);
            programmeForm.setEmailadmin(email);
            programmeForm.setPasswordAdmin(nric);
            programmeForm.setAcessLeveladmin(acslvl);
            
            em.persist(programmeForm);

            em.getTransaction().commit();
            
            return "configuration_register";

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }

    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String processForm(ModelMap map) throws Exception {
        try {
            
             return "configuration_register";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }

}
