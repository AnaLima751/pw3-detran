package br.com.ana.lima.detran.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name="multa")
public class Multa {
	@NotNull
	@Column (name = "idMulta")
	@Id
	private int id;
	
	@Future
	@Column (name = "vencimento")
	private LocalDate vencimento;
	
	@Column (name = "estadoMulta")
	private String estadoMulta;
	
	
	@Column (name = "orgao")
	private String orgao;
	
	@NotNull
	@ManyToOne
	@JoinColumn (name = "condutor")
	private Pessoa condutor;
	
	@NotNull
	@ManyToOne
	@JoinColumn (name = "veiculo")
	private Veiculo veiculo;
}
