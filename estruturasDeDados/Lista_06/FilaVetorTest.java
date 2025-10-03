package Lista_06;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class FilaVetorTest {

    @Test
    public void testarMetodoEstaVaziaTrue() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void testarMetodoEstaVaziaFalse() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        assertEquals(false, fila.estaVazia());
    }

    @Test
    public void testarEnfileirarDesenfileirar() {
        FilaVetor<Integer> fila = new FilaVetor<>(10);
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
    public void testarFilaCheia() {
        assertThrows(FilaCheiaException.class, () -> {
            FilaVetor<Integer> fila = new FilaVetor<>(3);
            fila.inserir(10);
            fila.inserir(20);
            fila.inserir(30);
            fila.inserir(40);
        });
    }

    @Test
    public void testarFilaVazia() {
        assertThrows(FilaVaziaException.class, () -> {
            FilaVetor<Integer> fila = new FilaVetor<>(3);
            fila.retirar();
        });
    }

    @Test
    public void testarMetodoPeek() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        Integer expected = 10;
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(expected, fila.peek());
        assertEquals(expected, fila.retirar());
    }

    @Test
    public void testarMetodoLiberar() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertEquals(true, fila.estaVazia());
    }

    @Test
    public void testarConcatenacao() {
        FilaVetor<Integer> fila = new FilaVetor<>(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        FilaVetor<Integer> fila2 = new FilaVetor<>(3);
        fila2.inserir(40);
        fila2.inserir(50);
        FilaVetor<Integer> fila3 = fila.criarFilaConcatenada(fila2);
        assertEquals("[ 10, 20, 30, 40, 50 ]", fila3.toString());
        assertEquals("[ 10, 20, 30 ]", fila.toString());
        assertEquals("[ 40, 50 ]", fila2.toString());
        assertEquals(8, fila3.getLimite());
    }

}
 