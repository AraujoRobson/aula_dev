package heranca;

public class Principal {

	public static void main(String[] args) {

		JogoTabuleiro tabuleiro = new JogoTabuleiro();
		JogoCartas cartas = new JogoCartas();
		JogoDados dado = new JogoDados();
			
		
		tabuleiro.setNome("Canvan");
		tabuleiro.setDistribuidora("Devir");
		tabuleiro.setNumJogadores(4);
		tabuleiro.setFaixaEtaria(12);
		tabuleiro.setTamanhoTabuleiro("30x40");
		tabuleiro.setQtdPecas(60);
		
		//M�TODOS DA SUBCLASSE
		tabuleiro.infoJogoTabuleiro();

		//M�TODOS DA SUPERCLASSE
		tabuleiro.setupTabuleiro();
		tabuleiro.jogar();
		
		
		cartas.setNome("Taco Gato");
		cartas.setDistribuidora("Paper Games");
		cartas.setNumJogadores(8);
		cartas.setFaixaEtaria(6);
		cartas.setTamanhoCartas("Padr�o");
		cartas.setQtdCartas(60);
		
		cartas.infoJogoCartas();
		cartas.jogarCarta();
		cartas.comprarCarta();
		cartas.descartarCarta();
		
		
		dado.setNome("Taco Gato");
		dado.setDistribuidora("Paper Games");
		dado.setNumJogadores(8);
		dado.setFaixaEtaria(6);
		dado.setTipoDados("Padr�o");
		dado.setQtdDados(3);
		
		dado.infoJogoDados();
		dado.arremessarDado();
		
		
	}

}
