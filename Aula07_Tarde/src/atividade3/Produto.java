package atividade3;

public class Produto {

	String nome;
	float peso, preco, valorFinal, reajuste;

	public Produto(String nome, float peso, float preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	void aumentarPreco() {
		if (preco < 50) {
			reajuste = (float) (preco * 0.2);
			valorFinal = (float) (preco + reajuste);
		} else {
			reajuste = (float) (preco * 0.1);
			valorFinal = (float) (preco + reajuste);
		}
		System.out.println("O produto " + nome + " teve reajuste de R$" +reajuste);
		System.out.println("E o valor final ficou: R$" +valorFinal);

	}

}
