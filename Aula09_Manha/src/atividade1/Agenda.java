package atividade1;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> agendaPessoas = new ArrayList<>();

	public ArrayList<Pessoa> getAgendaPessoas() {
		return agendaPessoas;
	}

	public void setAgendaPessoas(ArrayList<Pessoa> agendaPessoas) {
		this.agendaPessoas = agendaPessoas;
	}

	public void armazenaPessoa(String nome, int idade, double altura) {
		if (agendaPessoas.size() < 10) {
			agendaPessoas.add(new Pessoa(nome, idade, altura));
		} else {
			System.out.println("Agenda cheia!");
		}
	}

	void removePessoa(String nome) {
		System.out.println();
		for (int i = 0; i < agendaPessoas.size(); i++) {
			if (agendaPessoas.get(i).getNome().equals(nome)) {
				System.out.println(agendaPessoas.get(i).getNome() + "foi removido...");
				agendaPessoas.remove(i);
				break;
			}
		}

	}

	public int buscaPessoa(String nome) {
		System.out.println();
		System.out.println("Mostrando código da agenda: ");
		for (int i = 0; i < agendaPessoas.size(); i++) {
			if (agendaPessoas.get(i).getNome().equals(nome)) {
				return i + 1;
			}
		}
		return -1;

	}

	void imprimeAgenda() {
		System.out.println("______________________________");
		System.out.println("AGENDA:\n");
		for (int i = 0; i < agendaPessoas.size(); i++) {
			System.out.println("Código: " + (i + 1) + 
					"\nNome: " + agendaPessoas.get(i).getNome() + 
					"\nIdade: " + agendaPessoas.get(i).getIdade() + 
					"\nAltura: " + agendaPessoas.get(i).getAltura());
			System.out.println("---------");
		}
	}

	void imprimePessoa(int index) {
		System.out.println("______________________________");
		System.out.println("Código: " + (index) + 
				"\nNome: " + agendaPessoas.get(index -1).getNome() + 
				"\nIdade: " + agendaPessoas.get(index -1).getIdade() + 
				"\nAltura: " + agendaPessoas.get(index -1).getAltura());
		System.out.println("---------");

		
	}
	
	
}
