package principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Avaliador;
import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;

public class LeilaoTest {
	@Test
    public void testarLancesOrdemCrescente() {
		// Cen�rio
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 5");

        leilao.propoe(new Lance(joao, 2500.0));
        // leilao.propoe(new Lance(jose, 2500.0));
        // leilao.propoe(new Lance(maria, 2500.0));

        // A��o
        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        // Verifica��o
        double maiorLanceEsperado = 2500;
        double menorLanceEsperado = 2500;
        
        assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
        assertEquals(menorLanceEsperado, avaliador.getMenorLance());
    }
}
