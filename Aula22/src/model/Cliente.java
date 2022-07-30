package model;

public class Cliente extends Pessoa{
	private int codigo;
	public Cliente(String nome, int cod) {
		super.setNome(nome);
		this.codigo = cod;
	}
	@Override
	public String imprimeDados() {
		return 
				"Nome: " + super.getNome() +
				"Código: " + this.codigo;
	}
	public int getCodigo() {
		return this.codigo;
	}
}
