package com.terence.service;

import com.terence.service.interfaces.StudentServiceInterface;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class StudentService implements StudentServiceInterface {

	private final Logger logger = Logger.getLogger(StudentService.class);

	public String testApplicationRunning(String message) {
		logger.info("--> Testing start <--");
		if (message!=null) {
			return message;
		}
		return "This is a default message.";
	}
}
