package br.edu.pucgoias.eventosapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventoController {
	
	@GetMapping("/")
	public String iniciar() {
		return "Aplicação iniciada.";
	}

}
