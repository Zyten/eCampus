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
import javax.persistence.Query;
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
@RequestMapping(value = "/configuration_program_delete.htm")
public class configuration_program_deleteController {
    
    EntityManagerFactory factory;  
    
    @RequestMapping(method = RequestMethod.GET)
    public String displayForm(ModelMap map, String id) throws Exception {
        
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        Programme prog = em.find(Programme.class, Integer.parseInt(id));
        
        try {
            em.getTransaction().begin();
            em.remove(prog);
            em.getTransaction().commit();
            
            return "redirect:/configuration_program_main.htm";

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        }
        finally{
            em.close();
            factory.close();
        }
        
    }
        
}