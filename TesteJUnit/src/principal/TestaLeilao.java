package principal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dominio.Avaliador;
import dominio.Lance;
import dominio.Leilao;
import dominio.Usuario;

public class TestaLeilao {
	@Test
    public void testarLancesOrdemCrescente() {
		// Cenário
        Usuario joao = new Usuario("Joao");
        Usuario jose = new Usuario("Jose");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Playstation 5");

        leilao.propoe(new Lance(maria, 2500.0));
        leilao.propoe(new Lance(joao, 3000.0));
        leilao.propoe(new Lance(jose, 4000.0));

        // Ação
        Avaliador avaliador = new Avaliador();
        avaliador.avalia(leilao);

        // Verificação
        double maiorLanceEsperado = 4000;
        double menorLanceEsperado = 2500;
        
        assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
        assertEquals(menorLanceEsperado, avaliador.getMenorLance());
    }
}
