package abstracao;

public class Joystick {

	// atributos
	String modelo;
	String cor;
	int porcentagemBateria;

	// métodos
	void visualizarJoystick() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Porcentagem da Bateria: " + porcentagemBateria);
	}

	void conectar() {
		System.out.println("Joystick "+ modelo +" foi conectado");
	}

	void recarregar() {
		System.out.println("Joystick " + modelo + " esta carregando...");
	}

}
