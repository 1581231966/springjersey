package com.terence.config;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

public class JerseyConfiguration extends ResourceConfig {
	public JerseyConfiguration(){
		packages("com.terence.rest");
	}
}
