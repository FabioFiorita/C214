import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

import br.inatel.c214.OrdenaBubbleSort;
import br.inatel.c214.OrdenaInsertionSort;
import br.inatel.c214.OrdenaSelectionSort;
import br.inatel.c214.Ordenacao;
import br.inatel.c214.estrategia.BubbleSort;
import br.inatel.c214.estrategia.InsertionSort;
import br.inatel.c214.estrategia.SelectionSort;

public class TestOrdenacao {
    Ordenacao ordenacao;
    List<Integer> dados;
    List<Integer> esperado;

    @Before
    public void init() {
        dados = Arrays.asList(5, 3, 2, 4, 7, 1, 0, 6);
        esperado = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);
    }

    @After
    public void tearDown() {
        ordenacao = null;
        dados = null;
        esperado = null;
    }

    @Test
    public void testBubbleSort() {
        ordenacao = new OrdenaBubbleSort();
        assertTrue(ordenacao.getEstrategia() instanceof BubbleSort);
    }

    @Test
    public void testOrdenaBubbleSort() {
        ordenacao = new OrdenaBubbleSort();

        List<Integer> resultado = ordenacao.ordena(dados);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSelectionSort() {
        ordenacao = new OrdenaSelectionSort();
        assertTrue(ordenacao.getEstrategia() instanceof SelectionSort);
    }

    @Test
    public void testOrdenaSelectionSort() {
        ordenacao = new OrdenaSelectionSort();

        List<Integer> resultado = ordenacao.ordena(dados);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testInsertionSort() {
        ordenacao = new OrdenaInsertionSort();
        assertTrue(ordenacao.getEstrategia() instanceof InsertionSort);
    }

    @Test
    public void testOrdenaInsertionSort() {
        ordenacao = new OrdenaInsertionSort();

        List<Integer> resultado = ordenacao.ordena(dados);
        assertEquals(esperado, resultado);
    }
}
