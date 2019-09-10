package com.terence.elasticsearch.core;

import org.apache.http.HttpHost;
import org.apache.log4j.Logger;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

import java.io.IOException;

public class ElasticsearchClientFactory {

	private static final Logger logger = Logger.getLogger(ElasticsearchClientFactory.class);
	private RestClientBuilder builder;
	private RestHighLevelClient restHighLevelClient;
	private static ElasticsearchClientFactory elasticsearchClientFactory = null;

	private ElasticsearchClientFactory(){

	}

	public static ElasticsearchClientFactory getInstance(ElasticsearchEnvironment environment){
		if (elasticsearchClientFactory == null){
			logger.info("ElasticsearchClientFactory is null and init");
			elasticsearchClientFactory = new ElasticsearchClientFactory();
			elasticsearchClientFactory.init(environment);
			return elasticsearchClientFactory;
		}
		return elasticsearchClientFactory;
	}

	private void init(ElasticsearchEnvironment environment){
		builder = RestClient.builder(new HttpHost(environment.getHost(),environment.getPort()));
		builder.setRequestConfigCallback(builder -> {
			builder.setConnectTimeout(environment.getConnectTimeout());
			builder.setSocketTimeout(environment.getSocketTimeouot());
			builder.setContentCompressionEnabled(false);
			return builder;
		}).setMaxRetryTimeoutMillis(environment.getSocketTimeouot());
		restHighLevelClient = new RestHighLevelClient(builder);
	}

	public RestHighLevelClient getRestHighLevelClient(){
		return this.restHighLevelClient;
	}

	public void close(){
		if (restHighLevelClient != null){
			try {
				restHighLevelClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
