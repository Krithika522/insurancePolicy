package com.Krithika.insurancePolicy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.logging.LoggingApplicationListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewController {
    private Logger logger = LoggerFactory.getLogger(NewController.class);
    @RequestMapping(value="/email", method = RequestMethod.POST)
    public String postMethod(){
        logger.info("POST");
        return "email";
    }
    @RequestMapping(value="/email", method = RequestMethod.GET)
    public String getMethod(){
        logger.info("GET");
        return "email";
    }
}
