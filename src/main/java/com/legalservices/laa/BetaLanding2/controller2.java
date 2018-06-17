package com.legalservices.laa.BetaLanding2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.invoke.MethodHandles;
*/
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Controller
public class controller2 extends mController {

    
/* 	final static Logger logger = LoggerFactory.getLogger( MethodHandles.lookup().lookupClass() ) ;   */

	static private Logger logger = LogManager.getLogger();
	
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
        logger.error( "OssoUser " + OssoUser ) ;   
        logger.trace( "OssoUser " + OssoUser ) ; 
        
        return modelandView;
        
        
    }
    
}
