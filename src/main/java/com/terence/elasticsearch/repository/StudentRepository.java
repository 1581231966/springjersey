package com.terence.elasticsearch.repository;

import com.terence.entities.Student;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository  {

	@Autowired
	private RestClient restClient;

	public void testSearch(){
		IndexRequest request = new IndexRequest(
				"posts",
				"doc",
				"1");
		String jsonString = "{" +
				"\"user\":\"kimchy\"," +
				"\"postDate\":\"2013-01-30\"," +
				"\"message\":\"trying out Elasticsearch\"" +
				"}";
		request.source(jsonString, XContentType.JSON);
	}
}
