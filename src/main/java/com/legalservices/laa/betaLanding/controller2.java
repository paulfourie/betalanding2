package com.legalservices.laa.betaLanding;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


@Controller
public class controller2 extends mController {

    
	public static Logger log = LogManager.getLogger( controller2.class.getName() ) ;	
	
	
	@Autowired
	private HttpServletRequest request;
	
	
    public  controller2(){
        super();
    }
	
    
	/* , headers = "content-type=text/*"   */
    @RequestMapping( value="/" , method = RequestMethod.GET )
    public ModelAndView index() {
    	
    	
    	
        System.out.println("params "+params());
        
    
        ModelAndView modelandView = new ModelAndView("index", params());
        
        String OssoUser = request.getHeader("Osso-User-Guid"); 
        log.info( "OssoUser " + OssoUser ) ;   
        
        
        return modelandView;
    
        
    }
    
}
