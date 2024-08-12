package com.marvel.eh.controller.response;

import lombok.Getter;

@Getter
public class ComicsResponse {
	private String copyright;
	private String attributionHTML;
	
	private DataResponse data;
}
