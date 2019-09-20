package com.terence.elasticsearch.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.elasticsearch.search.SearchHit;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StudentResponse {

	private List<SearchHit> hitList;

	public List<SearchHit> getHitList() {
		return hitList;
	}

	public void setHitList(List<SearchHit> hitList) {
		this.hitList = hitList;
	}
}
