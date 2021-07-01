package com.rocketdev.eventoapi.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.rocketdev.eventoapi.domain.Convidado;
import com.rocketdev.eventoapi.domain.Evento;

/**
 * Interface que define as operações da camada de persistencia de Convidado
 * 
 * @author Rafael Marcelo
 *
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, Integer> {

	/**
	 * Método responsável por trazer a lista de convidados de um evento, caso exista
	 * 
	 * @param evento
	 * @return retona uma lista de convidados de um evento
	 */
	Iterable<Convidado> findByEvento(Evento evento);

	/**
	 * Método responsável por localizar um convidado dentro de um Evento
	 * 
	 * @param id
	 * @return retorna um convidado caso exista
	 */
	Optional<Convidado> findByIdConvidado(Integer id);

}
