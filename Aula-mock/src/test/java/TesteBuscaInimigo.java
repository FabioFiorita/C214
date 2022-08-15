import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaInimigo {
    @Test
    public void testeBuscaInimigoSkeleton() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo skeleton = buscaInimigo.buscaInimigo(10);
        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200,skeleton.getQtdVida(),0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());
    }
    @Test
    public void testeBuscaInimigoPadrao() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo padrao = buscaInimigo.buscaInimigo(99);
        assertEquals("Aranha", padrao.getNome());
        assertEquals(20,padrao.getQtdVida(),0.1);
        assertEquals("Teia", padrao.getArma());
    }
}
