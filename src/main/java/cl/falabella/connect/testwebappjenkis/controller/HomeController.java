/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.falabella.connect.testwebappjenkis.controller;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ext_dayanez
 */
@Controller
public class HomeController {
    
    private static final Logger log = LoggerFactory.getLogger(HomeController.class);
    
    @RequestMapping(value = "home.html", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public ModelAndView home(HttpSession session) {
        //System.out.println("Se carga la pantalla home");
        log.info("home -inicio");
        log.info("Se carga la pantalla home");
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("msg", "jenkins");
        log.info("home -fin");
        return modelAndView;
    }
    
    
}
