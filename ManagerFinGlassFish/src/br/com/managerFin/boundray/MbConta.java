package br.com.managerFin.boundray;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.managerFin.entity.Conta;

@ManagedBean
public class MbConta {

	private List<Conta> contas;

	
	public MbConta() {
		
		contas = new ArrayList<>();
		contas.add(new Conta("Default", new BigDecimal(123.50)));
		contas.add(new Conta("Poupança", new BigDecimal(1000.00)));
	
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	} 
	
	
}
