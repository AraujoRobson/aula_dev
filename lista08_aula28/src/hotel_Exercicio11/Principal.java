package hotel_Exercicio11;

import hotel_Exercicio11.model.Camareira;
import hotel_Exercicio11.model.Cliente;
import hotel_Exercicio11.model.Cozinheira;
import hotel_Exercicio11.model.FazTudo;
import hotel_Exercicio11.model.Gerente;
import hotel_Exercicio11.model.Recepcionista;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Robson", "49 970707070", "859.588.120-09", 5000.50);
		System.out.println(cliente.toString());
		System.out.println("-----------");

		Camareira camareira = new Camareira("Fatima", "nao informado", "361.530.030-01");
		System.out.println(camareira.toString());
		System.out.println("-----------");

		Cozinheira cozinheira = new Cozinheira("Nelsi", "49 970707070", "413.893.330-19");
		System.out.println(cozinheira.toString());
		System.out.println("-----------");

		FazTudo fazTudo = new FazTudo("Sevirino", "49 987654923", "992.553.570-00");
		System.out.println(fazTudo.toString());
		System.out.println("-----------");

		Gerente gerente = new Gerente("Jéssica", "49 989097070", "247.941.120-68");
		System.out.println(gerente.toString());
		System.out.println("-----------");

		Recepcionista recepcionista = new Recepcionista("Pedro", "nao informado", "649.110.850-37");
		System.out.println(recepcionista.toString());
	}
}
