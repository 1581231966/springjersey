package com.terence.elasticsearch;

import com.terence.elasticsearch.core.ElasticsearchClientFactory;
import com.terence.elasticsearch.core.ElasticsearchConfiguration;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElasticsearchConfigurationTest {

	private ElasticsearchConfiguration configuration;

	@Before
	public void init(){
		configuration = new ElasticsearchConfiguration();
	}
	@Test
	public void testGetFactory(){
		ElasticsearchClientFactory factory = configuration.getFactory();
		Assert.assertNotNull(factory);
	}
	@Test
	public void testGetHighLevelClient(){
		RestHighLevelClient client = configuration.getHighLevelClient();
		Assert.assertNotNull(client);
	}

	@Test
	public void testGetLowLevelClient(){
		RestClient client = configuration.getLowLevelClient();
		Assert.assertNotNull(client);
	}

}
