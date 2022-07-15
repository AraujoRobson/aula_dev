package estruturas.homogeneas;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		int[] nota = new int[5];
		int i;
		
		Scanner input = new Scanner(System.in);
		
		for (i = 0; i <= 4; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			nota[i] = input.nextInt();
		}

		for (i = 0; i <= 4; i++) {
			System.out.println(nota[i]);
		}

	}

}
