package br.edu.pucgoias.eventosapi.repositories;

import org.springframework.data.repository.CrudRepository;
import br.edu.pucgoias.eventosapi.domain.Convidado;

/**
 * Interface que define as operações da camada de persistencia de Convidado
 * 
 * @author Rafael Marcelo
 *
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, Integer> {

}
