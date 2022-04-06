package br.com.ana.lima.detran.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Multa {
	@Column (name = "idMulta")
	@Id
	private Long idVeiculo;
	
	@Column (name = "vencimento")
	private LocalDate vencimento;
	
	@Column (name = "estadoMulta")
	private String estadoMulta;
	
	@Column (name = "orgao")
	private String orgao;
	
	@JoinColumn (name = "pessoa")
	private Pessoa condutor;
	
	@JoinColumn (name = "veiculo")
	private Veiculo veiculo;
}
