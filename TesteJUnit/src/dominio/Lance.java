package dominio;

public class Lance {
    private Usuario usuario;
    private double valor;

    public Lance(Usuario usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getValor() {
        return valor;
    }

    public String imprimirDados() {
        return String.format("Usuário: %s, valor: R$%.2f", usuario, valor);
    }
}
