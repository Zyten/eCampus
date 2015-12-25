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
import javax.servlet.http.HttpSession;
import my.superprogrammer.ecampus.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/login.htm") //request login.htm, just nama
public class LoginController {
    EntityManagerFactory factory;       //to create conn with db. 
        
   

    @RequestMapping(method = RequestMethod.POST)    //defines POST
    public String processLogin(ModelMap map, String username, String password, HttpSession session) throws Exception {  //retreive input from form
        factory = Persistence.createEntityManagerFactory("eCampusPU");  //
        EntityManager em = factory.createEntityManager();  
        Admin admin = null;

        
        try {
            List result = em.createQuery("SELECT a FROM Admin a"
                    + " WHERE a.usernameAdmin = :usernameAdmin"
                    + " AND a.passwordAdmin = :passwordAdmin")
                    .setParameter("usernameAdmin", username)
                    .setParameter("passwordAdmin", password)
                    .getResultList();

            if (result.size() == 1) { //if user exist
                admin = (Admin) result.get(0);
                
                session.setAttribute("userSession", admin.getUsernameAdmin());
                return "redirect:/dashboard.htm";
            } else { //if user not exist
                return "redirect:/index.htm";
            }    
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
/*
    EntityManagerFactory factory;

    @RequestMapping(method = RequestMethod.POST)

    public String processForm(ModelMap map, String uname, String pwd) throws Exception {

        factory = Persistence.createEntityManagerFactory("eCampusPU");
        EntityManager em = factory.createEntityManager();
        boolean recordExist = false;
        Login loginForm = null;

        try {

            em.getTransaction().begin();

            List result = em.createNamedQuery("Login.findByUsername")
                    .setParameter("username", uname)
                    .getResultList();

            if (result.size() == 1) {
                loginForm = (Login) result.get(0);
            } else {
                loginForm = new Login();
            }

            loginForm.setUsername(uname);
            loginForm.setPassword(pwd);

            em.persist(loginForm);

            em.getTransaction().commit();

            return "dashboard";

        } catch (Exception ex) {
            em.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        } finally {
            em.close();
            factory.close();
        }

    }

}*/
