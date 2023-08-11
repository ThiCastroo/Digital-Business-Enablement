package br.com.reformas.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chuck")
public class ChuckNorrisController {
	
	@GetMapping
	public String chuckNorrisHello() {
		return "Hello Chuck Norris!";
		
	}
}
