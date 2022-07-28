package exercicios;

public class Produto {
	private String nome;
	private double preco;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	
	public void aumentarPreco(Produto p) {
		if(p.preco < 50) {
			this.preco = (preco+(preco*0.2));
		}else {
			this.preco = (preco+(preco*0.1));
		}
	}
	
	public double getPreco() {
		return this.preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
