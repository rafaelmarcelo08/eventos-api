package com.rocketdev.eventoapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketdev.eventoapi.repositories.ConvidadoRepository;

@RestController
@RequestMapping("/rest")
public class ConvidadoResource {

	@Autowired
	ConvidadoRepository convidadoRepository;


	@DeleteMapping("/excluir/{id}")
	public void excluir(@PathVariable Integer id) {
		convidadoRepository.deleteById(id);
	}

}
