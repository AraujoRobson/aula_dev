package outras.coisas;

import java.util.Scanner;

public class Calculadora {
	
	static float num1, num2, resultado;
	
	public static float soma(float x,float y) {
		return x+y;		
	}
	public static float sub(float x,float y) {
		return x-y;		
	}
	public static float mult(float x,float y) {
		return x*y;		
	}
	public static float div(float x,float y) {
		return x/y;		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		num1 = 6;
		num2 = 2;
		
		resultado = soma(num1,num2);

	}

}
