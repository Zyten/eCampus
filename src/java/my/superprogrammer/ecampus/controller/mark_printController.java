/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.superprogrammer.ecampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/mark_print.htm")
public class mark_printController {
    
    @RequestMapping(method = RequestMethod.GET)
/*    public String processForm(ModelMap map, 
            @RequestParam(required = true) String uname,  //retrive input from from
            @RequestParam(required = true) String pwd) throws Exception { */
    public String processForm(ModelMap map, String uname, String pwd) throws Exception {
        try {
            
             return "mark_print";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
        
    }

}
