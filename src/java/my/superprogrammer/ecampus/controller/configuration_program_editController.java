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
@RequestMapping(value = "/configuration_program_edit.htm")
public class configuration_program_editController {
    
    EntityManagerFactory factory;  
     
    @RequestMapping(method = RequestMethod.POST)
    public String processForm(ModelMap map, String pcode, String pname, String duration)
            throws Exception {
        
    factory = Persistence.createEntityManagerFactory("eCampusPU");
    EntityManager em = factory.createEntityManager();
    Programme editProgForm = null;
        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("Programme.findByProgCodeIDprogramme")
                    .setParameter("progCodeIDprogramme", Integer.parseInt(pcode))
                    .getResultList();

            if (result.size() == 1) {
                editProgForm = (Programme) result.get(0);
            } else {
                editProgForm = new Programme();
            }

            editProgForm.setProgCodeIDprogramme(Integer.parseInt(pcode));
            editProgForm.setProgNameprogramme(pname);
            editProgForm.setProgDurationprogramme(duration);

            em.persist(editProgForm);

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
    public String displayForm(ModelMap map, String id) throws Exception {
        
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        
        try {
            em.getTransaction().begin();
        
            List myList = em.createNamedQuery("Programme.findByProgCodeIDprogramme")
                    .setParameter("progCodeIDprogramme", Integer.parseInt(id))
                    .getResultList();
            
            map.put("myList", myList);
            
            return "configuration_program_edit";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }


}
