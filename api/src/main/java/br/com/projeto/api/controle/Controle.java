package br.com.projeto.api.controle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.IRepositorio;

@RestController
public class Controle {

	@Autowired //Serve para que o objeto não tenha que ser instanciado em cada rota
	private IRepositorio acao;
	
	@PostMapping("/")
	public Cliente cadastrar(@RequestBody Cliente c) {
		return acao.save(c); // c é um objeto contendo as caracteristicas: nome, idade,cidade
	}
	
//	@GetMapping("/")
//	public String teste() {
//		return "Hello World!";
//	}
	
}
