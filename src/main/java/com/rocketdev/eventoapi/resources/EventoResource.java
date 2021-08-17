package com.rocketdev.eventoapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketdev.eventoapi.domain.Evento;
import com.rocketdev.eventoapi.services.EventoService;

@RestController
@RequestMapping("/evento")
public class EventoResource {

	@Autowired
	EventoService eventoService;

	@GetMapping("/listar")
	public Iterable<Evento> listar() {
		return eventoService.listar();

	}

	@GetMapping()
	public String iniciar() {
		return "Aplicação iniciada.";
	}

}
