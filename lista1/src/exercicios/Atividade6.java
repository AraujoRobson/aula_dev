package exercicios;

public class Atividade6 {
	public String doarSangue(int idade) {
		if(idade >= 18 && idade <= 67) {
			return "Pode doar sangue!";
		}else {
			return "N�o pode doar sangue!";
		}
	}
}
