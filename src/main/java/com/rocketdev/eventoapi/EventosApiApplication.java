package com.rocketdev.eventoapi;

import java.util.Arrays;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.rocketdev.eventoapi.domain.Convidado;
import com.rocketdev.eventoapi.domain.Evento;
import com.rocketdev.eventoapi.repositories.ConvidadoRepository;
import com.rocketdev.eventoapi.repositories.EventoRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class EventosApiApplication implements CommandLineRunner {

	@Autowired
	EventoRepository eventoRepository;

	@Autowired
	ConvidadoRepository convidadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(EventosApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Evento ev1 = new Evento(null, "Curso de angular", "Goiania", 1000.0, new Date());
		Evento ev2 = new Evento(null, "Curso de Java POO", "Goiania", 500.0, new Date());

		Convidado c1 = new Convidado(null, "Rafael Marcelo", 22, ev1);
		Convidado c2 = new Convidado(null, "Lucas Alves", 18, ev2);
		Convidado c3 = new Convidado(null, "Pedro Henrique", 30, ev1);
		Convidado c4 = new Convidado(null, "Daniel Nunes", 35, ev2);

		ev1.getConvidados().addAll(Arrays.asList(c1, c3));
		ev2.getConvidados().addAll(Arrays.asList(c2, c4));

		eventoRepository.saveAll(Arrays.asList(ev1, ev2));
		convidadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4));

	}
}
