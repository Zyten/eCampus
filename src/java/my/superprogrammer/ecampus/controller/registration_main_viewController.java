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
@RequestMapping(value = "/registration_main_view.htm")
public class registration_main_viewController {
    EntityManagerFactory factory;
    int status = 0;
    @RequestMapping(method = RequestMethod.GET)

    public String displayPage(ModelMap map, String pcode) throws Exception {
              factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            List applicantList = em.createQuery("SELECT a FROM Applicant a"
                    + " WHERE a.pcodeApplicant = :pcodeApplicant"
                    + " AND a.statusApplicant = :statusApplicant")
                    .setParameter("pcodeApplicant", Integer.parseInt(pcode))
                    .setParameter("statusApplicant", status)
                    .getResultList();

            map.put("applicantList", applicantList);
             return "registration_main_view";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }

}
