package atividade2;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Animal> animais = new ArrayList<>();
		
		
		
		animais.add(new Homem());
		animais.add(new Gato());
		animais.add(new Cao());
		animais.add(new Homem());
		animais.add(new Gato());
		animais.add(new Cao());
		animais.add(new Homem());
		animais.add(new Gato());
		animais.add(new Cao());
		animais.add(new Homem());
		
		for(int i = 0; i < animais.size(); i++) {
			animais.get(i).falar();
		}
		
		
		
	}

}
