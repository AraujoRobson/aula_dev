package abstracao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//instancia da classe Joystick
		
		Joystick js = new Joystick();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o modelo do Joystick: ");
		js.modelo = input.next();
		System.out.print("Informe a cor: ");
		js.cor = input.next();
		System.out.print("nforme a porcentagem da bateria: ");
		js.porcentagemBateria = input.nextInt();
		
		
		
		js.visualizarJoystick();
		js.conectar();
		js.recarregar();

	}

}
