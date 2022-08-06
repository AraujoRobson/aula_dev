package hotel_Exercicio11.model;

public class Pessoa {

	private String nome, telefone, cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
				", telefone:" + telefone +
				", CPF:" + cpf;
	}

	public Pessoa(String nome, String telefone, String cpf) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public Pessoa() {
		super();
	}
}
