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

import java.io.IOException;
import java.util.HashMap;



/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/attendance.htm")
public class attendanceController {
    EntityManagerFactory factory;
    
    @RequestMapping(method = RequestMethod.GET)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String dispAttendance(ModelMap map) throws Exception {
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            
            List getList = em.createNamedQuery("Programme.findAll")
                    .getResultList();
            
            map.put("getList", getList); 
            
             return "attendance";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }

}
