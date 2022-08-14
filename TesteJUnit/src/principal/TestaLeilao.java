package principal;

import dominio.Avaliador;
import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;

public class TestaLeilao {
    public static void main(String[] args) {
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        System.out.println("Inicio do leilao");
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        System.out.println("");

        Leilao leilao = new Leilao("Playstation 5");

        leilao.propoe(new Lance(maria, 2500.0));
        leilao.propoe(new Lance(joao, 3000.0));
        leilao.propoe(new Lance(jose, 4000.0));

        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        System.out.println("Maior lance: R$ " + avaliador.getMaiorLance());
        System.out.println("Menor lance: R$ " + avaliador.getMenorLance());
    }
}
