package estrutura.repeticao;

public class RepeticaoFor {

	public static void main(String[] args) {
		int i;
		
		//de 1 até 10 de 1 em 1
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//de 10 até 1 de 1 em 1
		for (i = 10; i <= 1; i--) {
			System.out.println(i);
		}
		
		//de 1 ate 100 de 2 em 2
		for (i = 1; i <= 100; i+=2) {
			System.out.println(i);
		}
	}

}
