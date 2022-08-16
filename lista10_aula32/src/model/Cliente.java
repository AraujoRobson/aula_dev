package model;

import java.util.ArrayList;

public class Cliente {
	ArrayList<ContaCorrente> listaConta = new ArrayList<>();
	
	private String nome;
	
	public Cliente() {
	}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
