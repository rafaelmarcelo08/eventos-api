package br.edu.pucgoias.eventosapi.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.edu.pucgoias.eventosapi.domain.Evento;

@Service
@Transactional
public class EventoServiceImpl implements EventoService {

	@Override
	public Evento incluir(Evento evento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evento> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evento consultar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterar(Evento evento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Integer id) {
		// TODO Auto-generated method stub
		
	}
}