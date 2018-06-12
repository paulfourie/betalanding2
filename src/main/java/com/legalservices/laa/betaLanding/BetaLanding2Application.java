package com.legalservices.laa.betaLanding;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.ApplicationArguments;
/* import org.springframework.boot.ApplicationRunner;  */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/* weblogic additions */
import org.springframework.boot.builder.SpringApplicationBuilder;
/* import org.springframework.boot.context.web.SpringBootServletInitializer; */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;


import org.springframework.boot.context.web.SpringBootServletInitializer;


@Configuration
@ComponentScan
/* @SpringBootApplication */ 
@EnableAutoConfiguration
public class BetaLanding2Application extends SpringBootServletInitializer {

	
	private static final Logger logger = LogManager.getLogger( BetaLanding2Application.class );

	
	public static void main(String[] args) {
		SpringApplication.run(BetaLanding2Application.class, args);
	}
	
	
 	@Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

	
    private static Class<Application> applicationClass = Application.class;	
	
	
	
/*    @Override  */
/*    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.error( "Error. OK? " );
    }
*/
    
	
}


