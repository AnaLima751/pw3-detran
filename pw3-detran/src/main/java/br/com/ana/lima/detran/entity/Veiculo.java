package br.com.ana.lima.detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Veiculo {
	@Column (name = "idVeiculo")
	@Id
	private Long idVeiculo;
	
	@Column (name = "renavam")
	private String renavam;
	
	@Column (name = "placa")
	private String placa;
	
	@Column (name = "modelo")
	private String modelo;
	
	@Column (name = "ano")
	private Long ano;
	
	@JoinColumn (name = "proprietario")
	private Pessoa proprietario;
	
	
	
}
