package br.com.ana.lima.detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name =  "pessoa")
public class Pessoa {
	@Length(max= 4)
	@NotNull
	@Column (name = "idPessoa")
	@Id
	private int idPessoa;
	@Length(max= 40)
	@NotNull
	@Column (name = "nome")
	private String nome;
	
	@Length(max= 50)
	@Column (name = "endereco")
	private String endereco;
	
	
			
}
