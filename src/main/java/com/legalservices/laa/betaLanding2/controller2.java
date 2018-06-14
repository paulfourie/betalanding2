package com.legalservices.laa.betaLanding2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Controller
public class controller2 extends mController {

    
	public static final Logger log = LoggerFactory.getLogger( controller2.class ) ;	/* .getName()  */
	
	
	@Autowired
	private HttpServletRequest request;
	
	
    public  controller2(){
        super();
    }
	
    
	/* , headers = "content-type=text/*"   */
    @RequestMapping( value="/" , method = RequestMethod.GET )
    public ModelAndView index() {
    	    	
    	/* output mustache parameters */   	
        /* System.out.println("params " + params());  */
        
/*    	return new ModelAndView("index", params());  */
    	
        ModelAndView modelandView = new ModelAndView("index", params());
        
        String OssoUser = request.getHeader("Osso-User-Guid"); 
        log.info( "OssoUser " + OssoUser ) ;   
        
        return modelandView;
        
        /*
        try {
        	return modelandView;
        }
        catch( Exception e ){
        	log.error( e.getMessage() ) ; 
        	return modelandView;
        }
        */
        
    }
    
}
