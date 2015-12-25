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
@RequestMapping(value = "/registration_approve.htm")
public class registration_approveController {
    
    EntityManagerFactory factory;
    
    @RequestMapping(method = RequestMethod.GET)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String processForm(ModelMap map) throws Exception {
        try {
            
             return "registration_approve";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }
    
        @RequestMapping(method = RequestMethod.POST)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String approveForm(ModelMap map, String uname, String pwd) throws Exception {
        /*
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        
        Admin approveForm = null;

        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("Login.findByUsername")
                    .setParameter("username", uname)
                    .getResultList();

            if (result.size() == 1) {
                approveForm = (Admin) result.get(0);
            } else {
                approveForm = new Admin();
            }


            approveForm.setUsername(uname);
            approveForm.setPassword(pwd);

            em.persist(approveForm);

            em.getTransaction().commit();

            return "dashboard";

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }
                */
        return "dashboard";
    }


}
