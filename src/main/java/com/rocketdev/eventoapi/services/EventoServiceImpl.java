package com.rocketdev.eventoapi.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.rocketdev.eventoapi.domain.Evento;
import com.rocketdev.eventoapi.utils.EventoAPIException;

/**
 * Classe que define as operações da camada de negocio de Evento
 * 
 * @author Rafael Marcelo
 *
 */
@Service
@Transactional 
public class EventoServiceImpl implements EventoService {

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Evento incluir(Evento evento) throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Evento alterar(Evento evento) throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public void excluir(Integer id) throws EventoAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
	public Evento consultar(Integer id) throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
	public List<Evento> listar() throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

}