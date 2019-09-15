package com.terence.service;


import com.terence.elasticsearch.repository.StudentRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ElasticsearchService {

	private static final Logger logger = Logger.getLogger(ElasticsearchService.class.getName());
	private final StudentRepository studentRepository;

	public ElasticsearchService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public String testElasticsearch(){
		studentRepository.testSearch();
		return "Elasticsearch done";
	}
}
