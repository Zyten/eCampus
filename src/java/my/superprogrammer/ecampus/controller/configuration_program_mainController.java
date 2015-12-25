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

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/configuration_program_main.htm")
public class configuration_program_mainController {
    
    EntityManagerFactory factory;
    
    @RequestMapping(method = RequestMethod.GET)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String displayProgrammes(ModelMap map) throws Exception {
               factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        
        try {
            //em.getTransaction().begin();
        
            List progList = em.createNamedQuery("Programme.findAll")
                    .getResultList();
            map.put("progList", progList);
            
             return "configuration_program_main";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }

}
