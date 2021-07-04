package com.rocketdev.eventoapi.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.rocketdev.eventoapi.domain.Evento;
import com.rocketdev.eventoapi.utils.EventoAPIException;

@Service
@Transactional
public class EventoServiceImpl implements EventoService {

	@Override
	public Evento incluir(Evento evento) throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evento alterar(Evento evento) throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Integer id) throws EventoAPIException {
		// TODO Auto-generated method stub

	}

	@Override
	public Evento consultar(Integer id) throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evento> listar() throws EventoAPIException {
		// TODO Auto-generated method stub
		return null;
	}

}