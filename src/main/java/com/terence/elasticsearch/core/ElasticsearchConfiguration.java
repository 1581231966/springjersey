package com.terence.elasticsearch.core;

import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticsearchConfiguration {

	@Bean(destroyMethod = "close")
	public ElasticsearchClientFactory getFactory(){
		ElasticsearchEnvironment environment = new ElasticsearchEnvironment("lkc.gushenge.com", 9200,60000, 120000);
		return ElasticsearchClientFactory.getInstance(environment);
	}
	@Bean
	public RestHighLevelClient getHighLevelClient(){
		return getFactory().getRestHighLevelClient();
	}

	@Bean
	public RestClient getLowLevelClient(){
		return getFactory().getRestHighLevelClient().getLowLevelClient();
	}
}
