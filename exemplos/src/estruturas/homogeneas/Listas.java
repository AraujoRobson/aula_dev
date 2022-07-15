package estruturas.homogeneas;

import java.util.ArrayList;
import java.util.Collections;

public class Listas {

	public static void main(String[] args) {
		// instância de um objeto do tipo inteiro
		ArrayList<Integer> notas = new ArrayList<>();
		int i;
		String nome;

		notas.add(10);// adiciona direto
		notas.add(20);
		notas.add(30);
		notas.add(1, 100); //adiciona na posição inserida e "empurra" os demais para frente
		
		/*
		Excluir elemento da lista
		notas.remove(0); //apaga da posição desejada
		notas.remove(notas.size()-1); //apaga o ultimo 
		notas.clear();  limpa a lista */
	

		// forma 1 de exibir a lista
		for (i = 0; i < notas.size(); i++) {
			System.out.println(notas.get(i));
		}
		// forma 2 de exibir a lista
		notas.forEach(x -> {
			System.out.println(x);
		});		
		
		System.out.println(notas.size());//retorna o tamanho da lista
		System.out.println(notas.isEmpty());//verifica se a lista esta vazia
		System.out.println(Collections.max(notas));//retorna o maior valor
		System.out.println(Collections.min(notas));//renorna o menor valor
		Collections.sort(notas);//ordena de forma crescente obs. precisa mandar imprimir
		Collections.reverse(notas);//ordena de forma decrescente obs. precisa mandar imprimir
		notas.clear(); //apaga toda lista

	}

}
