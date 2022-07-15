package atividade1;

public class Calculadora {

	double resposta;
	

	void somar(double num1,double num2){
		resposta = num1 + num2;
		System.out.println("A soma é: " + resposta);
	}
	
	void subtrair(double num1,double num2){
		if (num1 > num2) {
			resposta = num1 - num2;
		} else {
			resposta = num2 - num1;
		}
		System.out.println("A subtração é: " + resposta);
	}
	
	void multiplicar(double num1,double num2){
		resposta = num1 * num2;
		System.out.println("A multiplicação é: " + resposta);
	}
	
	void dividir(double num1,double num2){
		if (num1 > num2) {
			resposta = num1 / num2;
		} else {
			resposta = num2 / num1;
		}
		System.out.println("A divisão é: " + resposta);
	}
	
}
