/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.superprogrammer.ecampus.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/logout.htm") //request login.htm, just nama
public class LogoutController {

    @RequestMapping(method = RequestMethod.GET)    //defines POST
    public String processLogout(ModelMap map, HttpSession session) throws Exception {  //retreive input from form
        try {
            if(session != null)
                    session.invalidate();

            return "redirect:/index.htm";   
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}