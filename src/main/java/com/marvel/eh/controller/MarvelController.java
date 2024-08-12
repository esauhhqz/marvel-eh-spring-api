package com.marvel.eh.controller;

import com.marvel.eh.controller.response.ComicsResponse;
import com.marvel.eh.controller.response.HeroesResponse;
import com.marvel.eh.impl.MarvelServiceImpl;
import com.marvel.eh.model.Busqueda;
import com.marvel.eh.repo.SearchRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RestController
@RequestMapping("/marvel")
public class MarvelController {

	private MarvelServiceImpl service;
	private final SearchRepository repository;



	@ResponseStatus(OK)
	@GetMapping("/comics")
	public ComicsResponse findAll() {
		return service.findAll();
	}

	@ResponseStatus(OK)
	@GetMapping("/heroes")
	public HeroesResponse characterFindAll() {
		Busqueda item = new Busqueda();
		item.setAction("Busqueda de Heroes");
		item.setUrl("/v1/public/characters");
		repository.saveAndFlush(item);
		return service.findAllCharacters();
	}

	@ResponseStatus(OK)
	@GetMapping("/test")
	public String testService() {
		return "Este es un serviocio seguro";
	}

}
