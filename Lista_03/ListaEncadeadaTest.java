package Lista_03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ListaEncadeadaTest {

    @Test
    public void testarListaVaziaTrue() {
        boolean esperado = true;
        boolean resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        resultado = lista.estaVazia();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarListaVaziaFalse() {
        boolean esperado = false;
        boolean resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        resultado = lista.estaVazia();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarInclusaoDeUmNumero() {
        Integer noEsperado = 5;
        Integer noResultado;
        NoLista<Integer> proximoEsperado = null;
        NoLista<Integer> proximoResultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        noResultado = lista.getPrimeiro().getInfo().intValue();
        proximoResultado = lista.getPrimeiro().getProximo();
        assertEquals(noEsperado, noResultado);
        assertEquals(proximoEsperado, proximoResultado);
    }

    @Test
    public void testarInclusaoDeTresNumeros() {
        String esperado = "[ 15, 10, 5 ]";
        String resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        resultado = lista.toString();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarBuscaDeDadosNaPrimeiraPosicao() {
        NoLista<Integer> esperado;
        NoLista<Integer> resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        esperado = lista.getPrimeiro();
        resultado = lista.buscar(20);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarBuscaDeDadosNoMeioDaLista() {
        NoLista<Integer> esperado;
        NoLista<Integer> resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        esperado = lista.getPrimeiro();
        lista.inserir(20);
        resultado = lista.buscar(15);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarBuscaDeDadoInexistente() {
        NoLista<Integer> esperado = null;
        NoLista<Integer> resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.buscar(50);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarExclusaoDePrimeiroElementoDaLista() {
        String esperado = "[ 15, 10, 5 ]";
        String resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        resultado = lista.toString();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarExclusaoDeElementoDoMeioDaLista() {
        String esperado = "[ 20, 10, 5 ]";
        String resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(15);
        resultado = lista.toString();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarObterNoDaPosicaoZero() {
        NoLista<Integer> esperado;
        NoLista<Integer> resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        esperado = lista.getPrimeiro();
        resultado = lista.obterNo(0);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarObterNoDaUltimaPosicao() {
        NoLista<Integer> esperado;
        NoLista<Integer> resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        esperado = lista.getPrimeiro();
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.obterNo(3);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarObterNoRecusaPosicaoInvalida() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ListaEncadeada<Integer> lista = new ListaEncadeada<>();
            lista.inserir(5);
            lista.inserir(10);
            lista.inserir(15);
            lista.inserir(20);
            lista.obterNo(10);
        });
    }

    @Test
    public void testarObterComprimentoListaVazia() {
        int esperado = 0;
        int resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        resultado = lista.obterComprimento();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarObterComprimentoNaoVazia() {
        int esperado = 4;
        int resultado;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.obterComprimento();
        assertEquals(esperado, resultado);
    }
}
