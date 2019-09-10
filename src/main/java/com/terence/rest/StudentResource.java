package com.terence.rest;

import com.terence.entities.Student;
import com.terence.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/terence")
public class StudentResource {

	@Autowired
	private StudentService studentService;

	@Autowired
	private ApplicationContext context;

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testRunning(){
		String msg = String.valueOf(context.getBeansOfType(StudentResource.class));
		return studentService.testApplicationRunning(msg);
	}
}
