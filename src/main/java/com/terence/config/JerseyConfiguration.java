package com.terence.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/*")
public class JerseyConfiguration extends ResourceConfig {
	JerseyConfiguration(){
		packages("com.terence.rest");
	}
}
