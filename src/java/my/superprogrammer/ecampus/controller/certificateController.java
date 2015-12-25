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
@RequestMapping(value = "/certificate.htm")
public class certificateController {

    EntityManagerFactory factory;
    
    @RequestMapping(method = RequestMethod.GET)
    public String dispCert(ModelMap map) throws Exception {
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
     
        try {
            em.getTransaction().begin();
            
            List getList = em.createNamedQuery("Programme.findAll")
                    .getResultList();
            
            map.put("getList", getList);
            
            return "certificate";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    }

}
