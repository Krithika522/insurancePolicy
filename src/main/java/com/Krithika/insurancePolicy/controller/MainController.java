package com.Krithika.insurancePolicy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private Logger logger = LoggerFactory.getLogger(MainController.class);
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String welcomePage(){
        logger.info("GET");
        return "index";
    }
    @RequestMapping(value="/index", method = RequestMethod.POST)
    public String welcomePost(){
       logger.info("POST");
        return "index";
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm()
    {

        return "login";
    }
    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
   public String checkLoginForm(@RequestParam String fname, String lname, ModelMap map){
        map.put("fname",fname);
        map.put("lname",lname);
        return "index";
   }
}
