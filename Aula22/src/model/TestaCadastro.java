package model;

public class TestaCadastro {

	public static void main(String[] args) {
		CadastroPessoas cp = new CadastroPessoas();
		Cliente cliente = new Cliente("Luiz", 10);
		Funcionario func = new Funcionario("Jéssica", 3500);
		Gerente gerente = new Gerente("Robson", 7000, "Suporte");
		
		cp.cadastrarPessoas(cliente);
		cp.cadastrarPessoas(func);
		cp.cadastrarPessoas(gerente);
		System.out.println(cp.imprimeCadastro(0));
		
	}

}
