package com.terence.elasticsearch.repository;

import org.apache.log4j.Logger;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Arrays;

@Repository
public class StudentRepository  {

	private static final Logger logger = Logger.getLogger(StudentRepository.class.getName());
	private final RestClient restClient;

	private final RestHighLevelClient restHighLevelClient;

	public StudentRepository(RestClient restClient, RestHighLevelClient restHighLevelClient) {
		this.restClient = restClient;
		this.restHighLevelClient = restHighLevelClient;
	}

	public void testSearch(){
		logger.info("--Elastic search testing start--");
/*		IndexRequest request = new IndexRequest(
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
		}*/
		SearchRequest searchRequest = new SearchRequest("posts");
		searchRequest.types("doc");
		try {
			SearchResponse searchResponse = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);
			SearchHit searchHit = searchResponse.getHits().getAt(0);
			SearchHit[] searchHits = searchResponse.getHits().getHits();
			logger.info(Arrays.toString(searchHits));
		} catch (IOException e) {
			e.printStackTrace();
		}
		logger.info(searchRequest.preference());
		logger.info("--Done--");
	}

}
