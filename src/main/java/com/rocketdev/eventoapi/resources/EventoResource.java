package com.rocketdev.eventoapi.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketdev.eventoapi.domain.Evento;
import com.rocketdev.eventoapi.services.EventoService;

@RestController
@RequestMapping("/rest")
public class EventoResource {

	@Autowired
	EventoService eventoService;

	@GetMapping("/evento/listar")
	public Iterable<Evento> listar() {
		return eventoService.listar();
	}

	@GetMapping("/consultar/{id}")
	public Optional<Evento> consultar(@PathVariable Integer id) {
		return eventoService.consultar(id);
	}

	@GetMapping()
	public String iniciar() {
		return "Aplicação iniciada.";
	}

}
