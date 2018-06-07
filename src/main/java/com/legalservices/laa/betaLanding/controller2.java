package com.legalservices.laa.betaLanding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class controller2 extends mController {

    public  controller2(){
        super();
    }

    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("params "+params());
        return new ModelAndView("index", params());
    }
}
