package com.rocketdev.eventoapi.services;

import java.util.List;
import com.rocketdev.eventoapi.domain.Evento;
import com.rocketdev.eventoapi.utils.EventoAPIException;

/**
 * Interface que define as operações da camada de negocio de Evento
 * 
 * @author Rafael Marcelo
 *
 */
public interface EventoService {

	/**
	 * Método para incluir um evento
	 * 
	 * @param evento
	 * @return retorna Evento, caso nao retorna nenhum erro na validação
	 * @throws EventoAPIException caso exista um erro, retorna uma
	 *                            EventoAPIException
	 */
	public Evento incluir(Evento evento) throws EventoAPIException;

	/**
	 * Método para alterar um evento
	 * 
	 * @param evento
	 * @return retorna Evento, caso nao retorna nenhum erro na validação
	 * @throws EventoAPIException caso exista um erro, retorna uma
	 *                            EventoAPIException
	 */
	public Evento alterar(Evento evento) throws EventoAPIException;

	/**
	 * Método para excluir um evento
	 * 
	 * @param id
	 * @throws EventoAPIException caso exista um erro, retorna uma
	 *                            EventoAPIException
	 */
	public void excluir(Integer id) throws EventoAPIException;

	/**
	 * Método para consultar um evento
	 * 
	 * @param id
	 * @return retorna Evento, se existir no banco de dados
	 * @throws EventoAPIException caso exista um erro, retorna uma
	 *                            EventoAPIException
	 */
	public Evento consultar(Integer id) throws EventoAPIException;

	/**
	 * Método para listar os eventos
	 * 
	 * @return uma lista de eventos
	 * @throws EventoAPIException caso exista um erro, retorna uma
	 *                            EventoAPIException
	 */
	public List<Evento> listar() throws EventoAPIException;

}
