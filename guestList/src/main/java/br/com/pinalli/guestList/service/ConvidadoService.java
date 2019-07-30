package br.com.pinalli.guestList.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.pinalli.guestList.model.Convidado;
import br.com.pinalli.guestList.repository.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;

	
	public Iterable<Convidado> obterTodos(){
		
		Iterable<Convidado> convidados = repository.findAll();
		
		return convidados;
		
	}
	
	public void salvar(Convidado convidado) {
		repository.save(convidado);
	}
}
