package com.terence.elasticsearch;

import org.junit.Test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

public class TestClass {

	@Test
	public void testMain(){
	/*	WebTarget target = ClientBuilder.newClient().target("http://47.106.232.171:9200");
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON);
		Response response = builder.get();
		System.out.println(response.bufferEntity());
		System.out.println("Response" + response.readEntity(String.class));*/
		Map<String, String> map = new HashMap<>();
		System.out.println(map.get(null));

	}
}
