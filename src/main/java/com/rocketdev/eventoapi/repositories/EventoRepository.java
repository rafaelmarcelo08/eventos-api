package com.rocketdev.eventoapi.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.rocketdev.eventoapi.domain.Evento;

/**
 * Interface que define as operações da camada de persistencia de Evento
 * 
 * @author Rafael Marcelo
 *
 */
public interface EventoRepository extends CrudRepository<Evento, Integer> {

	/**
	 * Método responsável por localizar um Evento
	 * 
	 * @param id
	 * @return retona um evento, caso exista
	 */
	Optional<Evento> findByID(Integer id);

}
