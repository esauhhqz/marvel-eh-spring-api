package com.marvel.eh.impl;

import com.marvel.eh.client.MarvelComicsClient;
import com.marvel.eh.controller.response.ComicsResponse;
import com.marvel.eh.controller.response.HeroesResponse;
import lombok.AllArgsConstructor;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class MarvelServiceImpl {
	private static final String PUBLIC_KEY = "de8ae6b7ddc90c4bbcaba79435515c1a";
	private static final String PRIVATE_KEY = "36411abdd8d7167a1f98760edadb5189be6b339d";

	private MarvelComicsClient client;

	//--- * Obtener todos las historietas * ---
	public ComicsResponse findAll() {
		Long timeStamp = new Date().getTime();
		return client.getAll(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}

	//--- * Obtener todos los personajes * ---
	public HeroesResponse findAllCharacters(){
		Long timeStamp = new Date().getTime();
		return client.getAllCharacter(timeStamp, PUBLIC_KEY, buildHash(timeStamp));
	}

	private String buildHash(Long timeStamp) {
		return DigestUtils.md5Hex(timeStamp + PRIVATE_KEY + PUBLIC_KEY);
	}
}
