package com.marvel.eh.controller.response;

import lombok.Getter;

@Getter
public class HeroesResponse {
	private String copyright;
	private String attributionHTML;
	
	private DataResponse data;
}
