package br.com.managerFin.entity;

import java.math.BigDecimal;

public class Conta {

	private String nome;
	private BigDecimal valorTotal;
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
			
	public Conta(String nome, BigDecimal valorTotal) {
		super();
		this.nome = nome;
		this.valorTotal = valorTotal;
	}




	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
