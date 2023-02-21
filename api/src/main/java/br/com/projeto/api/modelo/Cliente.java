package br.com.projeto.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter
@Setter

public class Cliente {
	@Id // Serve para indicar que é a Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Serve para autoincremento
	private long codigo;
	private String nome;
	private int idade;
	private String cidade;

}
