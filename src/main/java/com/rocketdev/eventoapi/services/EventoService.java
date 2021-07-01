package com.rocketdev.eventoapi.services;

import java.util.List;

import com.rocketdev.eventoapi.domain.Evento;

public interface EventoService {
	
	public Evento incluir(Evento evento);

	public List<Evento> listar();

	public Evento consultar(Integer id);

	public void alterar(Evento evento);

	public void excluir(Integer id);

}
