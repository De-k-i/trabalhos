package Lista_06;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FilaListaTest {
    
    @Test
    public void testarMetodoEstaVaziaTrue() {
        FilaLista<Integer> fila = new FilaLista<>();
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void testarMetodoEstaVaziaFalse() {
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        assertEquals(false, fila.estaVazia());
    }

    @Test
    public void testarEnfileirarDesenfileirar() {
        FilaLista<Integer> fila = new FilaLista<>();
        Integer expected1 = 10;
        Integer expected2 = 20;
        Integer expected3 = 30;
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(expected1, fila.retirar());
        assertEquals(expected2, fila.retirar());
        assertEquals(expected3, fila.retirar());
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void testarMetodoPeek() {
        FilaLista<Integer> fila = new FilaLista<>();
        Integer expected = 10;
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(expected, fila.peek());
        assertEquals(expected, fila.retirar());
    }

    @Test
    public void testarMetodoLiberar() {
        FilaLista<Integer> fila = new FilaLista<>();
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertEquals(true, fila.estaVazia());
    }

}
