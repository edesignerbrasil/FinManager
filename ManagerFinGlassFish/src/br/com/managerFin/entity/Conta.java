package br.com.managerFin.entity;

import java.math.BigDecimal;

public class Conta {

	private String nome;
	private BigDecimal saldoConta;
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
			
	public Conta(String nome, BigDecimal valorTotal) {
		super();
		this.nome = nome;
		this.saldoConta = valorTotal;
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(BigDecimal valorTotal) {
		this.saldoConta = valorTotal;
	}
	
	
}
