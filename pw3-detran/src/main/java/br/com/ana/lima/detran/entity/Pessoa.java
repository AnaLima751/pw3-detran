package br.com.ana.lima.detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name =  "pessoa")
public class Pessoa {
	
	@Column (name = "idPessoa")
	@Id
	private int idPessoa;
	
	@Column (name = "nome")
	private String nome;
	
	@Column (name = "endereco")
	private String endereco;
	
	
			
}
