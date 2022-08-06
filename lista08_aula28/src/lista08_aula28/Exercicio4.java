package lista08_aula28;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com seu peso: ");
        float peso = scan.nextFloat();
        System.out.println("Entre com sua altura: (em metros)");
        float altura = scan.nextFloat();

        double imc = peso * (Math.pow(altura, 2));

        String resultado;
        if (imc < 18.5) {
            resultado = "Classificação: MAGREZA";
        } else if (imc <= 24.9) {
            resultado = "Classificação: NORMAL";
        } else if (imc <= 29.9) {
            resultado = "Classificação: SOBREPESO";
        } else if (imc <= 39.9) {
            resultado = "Classificação: OBESIDADE";
        } else {
            resultado = "Classificação: OBESIDADE GRAVE";
        }
        System.out.println("O IMC é: " + String.format("%.2f", imc) + "\n" + resultado);
    }
}
