package estrutura.repeticao;

public class RepeticaoWhile {

	public static void main(String[] args) {
		
		int i;
		
		
		i = 1;
		while (i <= 10) { //enquanto o i for menor ou igual 10 faça
			System.out.println(i);	//mostra o i
			i++; 					//i++ para incrementar
		}
		i = 10;
		while (i >= 1) { //enquanto o i for maior ou igual 1 faça
			System.out.println(i);
			i--; 					//i-- para decrementar
		}
		i = 1;
		while (i <= 10) {
			System.out.println(i);
			i+=2;					//i+=2 para pular de 2 em 2
		}

	}

}
