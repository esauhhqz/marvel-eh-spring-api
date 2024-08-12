package com.marvel.eh.client;


import com.marvel.eh.controller.response.ComicsResponse;
import com.marvel.eh.controller.response.HeroesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "marvel", url = "${url.marvel}/v1/public")
public interface MarvelComicsClient {
	@GetMapping("/comics")
	public ComicsResponse getAll(@RequestParam(value = "ts") Long timeStamp,
								 @RequestParam(value = "apikey") String publicKey, @RequestParam(value = "hash") String hashMD5);

	@GetMapping("/characters")
	public HeroesResponse getAllCharacter(@RequestParam(value = "ts") Long timeStamp,
										  @RequestParam(value = "apikey") String publicKey, @RequestParam(value = "hash") String hashMD5);
}
