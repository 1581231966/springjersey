package com.terence.service;


import com.terence.elasticsearch.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ElasticsearchService {

	@Autowired
	private StudentRepository studentRepository;

	public String testElasticsearch(){
		studentRepository.testSearch();
		return "Elasticsearch done";
	}
}
