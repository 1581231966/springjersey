package com.terence.elasticsearch.repository;

import com.terence.entities.Student;
import org.apache.log4j.Logger;
import org.elasticsearch.action.get.GetRequestBuilder;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestOperations;

import java.io.IOException;

@Repository
public class StudentRepository  {

	private static final Logger logger = Logger.getLogger(StudentRepository.class.getName());
	@Autowired
	private RestClient restClient;

	@Autowired
	private RestHighLevelClient restHighLevelClient;

	public void testSearch(){
		logger.info("--Elastic search testing start--");
		IndexRequest request = new IndexRequest(
				"posts",
				"doc",
				"2");
		String jsonString = "{" +
				"\"user\":\"kimchy\"," +
				"\"postDate\":\"2013-01-30\"," +
				"\"message\":\"trying out Elasticsearch\"" +
				"}";
		request.source(jsonString, XContentType.JSON);
		try {
			restHighLevelClient.index(request, RequestOptions.DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info("--Done--");
	}
}
