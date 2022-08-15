package dominio;

public class Usuario {
    private String nome;

    public Usuario() {
        super();
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String imprimirDados() {
        return "Nome: " + this.nome;
    }
}
