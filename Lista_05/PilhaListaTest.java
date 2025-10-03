package Lista_05;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PilhaListaTest {

    @Test
    public void testarMetodoEstaVaziaTrue() {
        boolean esperado = true;
        boolean resultado;
        PilhaLista<Integer> pilha = new PilhaLista<>(5);
        resultado = pilha.estaVazia();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarMetodoEstaVaziaFalse() {
        boolean esperado = false;
        boolean resultado;
        PilhaLista<Integer> pilha = new PilhaLista<>(5);
        pilha.push(10);
        resultado = pilha.estaVazia();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarSeDadosSaoEmpilhadosCorretamente() {
        Integer esperado1 = 30;
        Integer esperado2 = 20;
        Integer esperado3 = 10;
        PilhaLista<Integer> pilha = new PilhaLista<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(esperado1, pilha.pop());
        assertEquals(esperado2, pilha.pop());
        assertEquals(esperado3, pilha.pop());
    }

    @Test
    public void testarMetodoPeek() {
        Integer esperado = 30;
        PilhaLista<Integer> pilha = new PilhaLista<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(esperado, pilha.peek());
        assertEquals(esperado, pilha.pop());
    }

    @Test
    public void testarMetodoLiberar() {
        boolean esperado = true;
        PilhaLista<Integer> pilha = new PilhaLista<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertEquals(esperado, pilha.estaVazia());
    }

}
