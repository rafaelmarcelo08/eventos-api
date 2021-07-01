package com.rocketdev.eventoapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rocketdev.eventoapi.domain.Convidado;

/**
 * Interface que define as operações da camada de persistencia de Convidado
 * 
 * @author Rafael Marcelo
 *
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, Integer> {

}
