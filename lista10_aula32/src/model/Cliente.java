package model;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	
	ArrayList<ContaCorrente> cc;
	ArrayList<ContaEspecial> ce;
	
	public Cliente() {
	}
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
		this.cc = new ArrayList<ContaCorrente>();
	}
	
	public Cliente(String nome, double limite) {
		super();
		this.nome = nome;
		this.ce = new ArrayList<ContaEspecial>();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
