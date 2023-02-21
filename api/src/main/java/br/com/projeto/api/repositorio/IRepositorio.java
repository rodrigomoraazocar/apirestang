package br.com.projeto.api.repositorio;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

import br.com.projeto.api.modelo.Cliente;

//@Repository                                         //Informamos a Classe(Cliente) e o tipo de dado (Long) da Primary Key da Classe Cliente    
public interface IRepositorio extends CrudRepository<Cliente,Long>{

}
