package estruturas.homogeneas;

public class Matriz {

	public static void main(String[] args) {

		int[][] nota = new int[2][3];
		int iLinha, iColuna;

		nota[0][0] = 0;
		nota[0][1] = 1;
		nota[0][2] = 0;
		nota[1][0] = 1;
		nota[1][1] = 0;
		nota[1][2] = 1;

		for (iLinha = 0; iLinha <= 1; iLinha++) {
			System.out.println();
			for (iColuna = 0; iColuna <= 2; iColuna++) {
				System.out.print(nota[iLinha][iColuna] + " ");
			}

		}

	}

}
