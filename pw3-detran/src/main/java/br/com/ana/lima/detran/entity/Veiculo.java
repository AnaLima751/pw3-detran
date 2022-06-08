package br.com.ana.lima.detran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="veiculo")

public class Veiculo {
	@NotNull
	@Column (name = "idVeiculo")
	@Id
	private int idVeiculo;
	
	@NotNull
	@Column (name = "renavam")
	private String renavam;
	
	@Length(max= 8)
	@NotNull
	@Column (name = "placa")
	private String placa;
	
	@Length(max= 20)
	@NotNull
	@Column (name = "modelo")
	private String modelo;
	
	@NotNull
	@Column (name = "ano")
	private int ano;
	
	@NotNull
	@ManyToOne
	@JoinColumn (name = "proprietario")
	private Pessoa proprietario;
	
	
	
}
