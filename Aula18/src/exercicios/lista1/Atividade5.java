package exercicios.lista1;

public class Atividade5 {
	public String votar(String nome, int idade) {
		if(idade<16) {
			return " " + nome + ", não pode votar! ";
		}else {
			return " " + nome + ", apto para votar! ";
		}
		
	}
}
