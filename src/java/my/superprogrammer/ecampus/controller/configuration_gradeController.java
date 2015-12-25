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
import my.superprogrammer.ecampus.model.ConfigurationMark;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/configuration_grade.htm")
public class configuration_gradeController {
    
    EntityManagerFactory factory;
    ConfigurationMark programmeForm;
    @RequestMapping(method = RequestMethod.POST)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String processForm(ModelMap map, String pcode, String pasmnt, String pquiz, String pfinal) throws Exception {
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        
       

        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("ConfigurationMark.findByPCodemark")
                    .setParameter("pCodemark", pcode)
                    .getResultList();

            if (result.size() == 1) {
                programmeForm = (ConfigurationMark) result.get(0);
            } else {
                programmeForm = new ConfigurationMark();
            }

            programmeForm.setPCodemark(pcode);
            programmeForm.setPAsmntmark(Integer.parseInt(pasmnt));
            programmeForm.setPQuizmark(Integer.parseInt(pquiz));
            programmeForm.setPFinalmark(Integer.parseInt(pfinal));
            
            em.persist(programmeForm);

            em.getTransaction().commit();
            
            return "redirect:/configuration_grade.htm";

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }

    } 
    
    @RequestMapping(method = RequestMethod.GET)
    /*    public String processForm(ModelMap map, 
     @RequestParam(required = true) String uname,  //retrive input from from
     @RequestParam(required = true) String pwd) throws Exception { */
    public String processForm(ModelMap map) throws Exception {
        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
     
        try {
            List getList = em.createNamedQuery("ConfigurationMark.findAll")
                    .getResultList();
            
            map.put("getList", getList);
            
            return "configuration_grade";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }

    } 


}
