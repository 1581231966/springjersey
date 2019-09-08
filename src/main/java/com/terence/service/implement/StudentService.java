package com.terence.service.implement;

import com.terence.service.StudentServiceInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class StudentService implements StudentServiceInterface {

	public String testApplicationRunning(String message) {
		if (message!=null) {
			return message;
		}
		return "This is a default message.";
	}
}
