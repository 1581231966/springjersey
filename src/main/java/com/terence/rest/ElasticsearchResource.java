package com.terence.rest;

import com.terence.service.ElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/elasticsearch")
public class ElasticsearchResource {

	private ElasticsearchService elasticsearchService;

	public ElasticsearchResource(ElasticsearchService elasticsearchService){
		this.elasticsearchService = elasticsearchService;
	}
	@Path("/testes")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String testElasticsearch(){

		return elasticsearchService.testElasticsearch();
	}
}
