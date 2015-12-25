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
@RequestMapping(value = "/certificate_print.htm")
public class certificate_printController {
    EntityManagerFactory factory;  
    
    @RequestMapping(method = RequestMethod.GET)

    public String dispCertPrint(ModelMap map, String appID) throws Exception {
         factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        try {
            
             List myList = em.createNamedQuery("Applicant.findByApplicantIDapplicant")
                    .setParameter("applicantIDapplicant", Integer.parseInt(appID))
                    .getResultList();
            
            map.put("myList", myList);
            
             return "certificate_print";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        } }}
