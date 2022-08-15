package exercicios1;

import java.util.Scanner;

public class Ex1d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int[] numeros = new int[2];
            System.out.println("Digite o 1o numero inteiro:");
            numeros[0] = scan.nextInt();
            System.out.println("Digite o 2o numero inteiro:");
            numeros[1] = scan.nextInt();

            System.out.println("\n" + numeros[0] / numeros[1]);
        } catch (ArithmeticException e) {
            System.out.println("Impossivel dividir por 0");
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro de execução identificado");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro encontrado");
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }
    }
}
