package br.com.reformas.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/universe")
public class UniverseController {

	@GetMapping
	public String universeHello() {
		return "Hello Universe!";
		
	}
}
