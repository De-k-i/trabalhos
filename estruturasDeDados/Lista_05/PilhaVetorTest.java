package Lista_05;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class PilhaVetorTest {

    @Test
    public void testarMetodoEstaVaziaTrue() {
        boolean esperado = true;
        boolean resultado;
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        resultado = pilha.estaVazia();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarMetodoEstaVaziaFalse() {
        boolean esperado = false;
        boolean resultado;
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        resultado = pilha.estaVazia();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarSeDadosSaoEmpilhadosCorretamente() {
        Integer esperado1 = 30;
        Integer esperado2 = 20;
        Integer esperado3 = 10;
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(esperado1, pilha.pop());
        assertEquals(esperado2, pilha.pop());
        assertEquals(esperado3, pilha.pop());
    }

    @Test
    public void testarLancamentoExcecaoPilhaCheia() {
        assertThrows(PilhaCheiaException.class, () -> {
            PilhaVetor<Integer> pilha = new PilhaVetor<>(3);
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);
            pilha.push(40);
        });
    }

    @Test
    public void testarLancamentoExcecaoPilhaVazia() {
        assertThrows(PilhaVaziaException.class, () -> {
            PilhaVetor<Integer> pilha = new PilhaVetor<>(3);
            pilha.pop();
        });
    }

    @Test
    public void testarMetodoPeek() {
        Integer esperado = 30;
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        assertEquals(esperado, pilha.peek());
        assertEquals(esperado, pilha.pop());
    }

    @Test
    public void testarMetodoLiberar() {
        boolean esperado = true;
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        assertEquals(esperado, pilha.estaVazia());
    }

    @Test
    public void testarMetodoConcatenar() {
        String esperado = "[ 50, 40, 30, 20, 10 ]";
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        PilhaVetor<Integer> pilha2 = new PilhaVetor<>(5);
        pilha2.push(40);
        pilha2.push(50);
        pilha.concatenar(pilha2);
        assertEquals(esperado, pilha.toString());
    }
}
