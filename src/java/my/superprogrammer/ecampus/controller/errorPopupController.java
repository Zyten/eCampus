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
@RequestMapping(value = "/errorPopup.htm") //request login.htm, just nama
public class errorPopupController {


    @RequestMapping(method = RequestMethod.GET)
    public String processForm(ModelMap map) throws Exception {

        try {
            return "errorPopup";

        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        } 
    }
}
