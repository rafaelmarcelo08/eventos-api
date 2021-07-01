package com.rocketdev.eventoapi.repositories;

import org.springframework.data.repository.CrudRepository;
import com.rocketdev.eventoapi.domain.Evento;

/**
 * Interface que define as operações da camada de persistencia de Evento
 * 
 * @author Rafael Marcelo
 *
 */
public interface EventoRepository extends CrudRepository<Evento, Integer> {

}
