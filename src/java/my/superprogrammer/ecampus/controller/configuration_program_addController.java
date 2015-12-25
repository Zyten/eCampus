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
@RequestMapping(value = "/configuration_program_add.htm")
public class configuration_program_addController {
    
    EntityManagerFactory factory;  
     
    @RequestMapping(method = RequestMethod.POST)
    public String processForm(ModelMap map, String pcode, String pname, String duration)
            throws Exception {
        
    factory = Persistence.createEntityManagerFactory("eCampusPU");
    EntityManager em = factory.createEntityManager();
    Programme addProgForm = null;
        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("Programme.findByProgCodeIDprogramme")
                    .setParameter("progCodeIDprogramme", Integer.parseInt(pcode))
                    .getResultList();

            if (result.size() == 1) {
                return "redirect:/errorPopup.htm";
            } else {
                addProgForm = new Programme();
            }

            addProgForm.setProgCodeIDprogramme(Integer.parseInt(pcode));
            addProgForm.setProgNameprogramme(pname);
            addProgForm.setProgDurationprogramme(duration);

            em.persist(addProgForm);

            em.getTransaction().commit();

            return "redirect:/configuration_program_main.htm";

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }  
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String displayForm(ModelMap map) throws Exception {
        
        try {
            
            return "configuration_program_add";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
        
}
