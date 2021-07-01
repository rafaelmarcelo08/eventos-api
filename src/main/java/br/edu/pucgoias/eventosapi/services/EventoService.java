package br.edu.pucgoias.eventosapi.services;

import java.util.List;
import br.edu.pucgoias.eventosapi.domain.Evento;

public interface EventoService {
	
	public Evento incluir(Evento evento);

	public List<Evento> listar();

	public Evento consultar(Integer id);

	public void alterar(Evento evento);

	public void excluir(Integer id);

}
