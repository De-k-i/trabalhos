package Lista_01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class ListaEstaticaTest {

    @Test
    public void testInserir() {
        String resultado;
        String esperado = "5,10,15,20";
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.toString();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testExibir() {
        int resultado;
        int esperado = 4;
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.getTamanho();
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarExistente() {
        int resultado;
        int esperado = 2;
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.buscar(15);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarInexistente() {
        int resultado;
        int esperado = -1;
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.buscar(30);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testRetirar() {
        String stringResultado;
        String stringEsperada = "5,15,20";
        int tamanhoResultado;
        int tamanhoEsperado = 3;
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        stringResultado = lista.toString();
        tamanhoResultado = lista.getTamanho();
        assertEquals(stringEsperada, stringResultado);
        assertEquals(tamanhoEsperado, tamanhoResultado);
    }

    @Test
    public void testInclusaoComRedimensionamento() {
        String stringResultado;
        String stringEsperada = "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15";
        int tamanhoResultado;
        int tamanhoEsperado = 15;
        ListaEstatica lista = new ListaEstatica();
        for (int i = 0; i < 15; i++) {
            lista.inserir(i + 1);
        }
        stringResultado = lista.toString();
        tamanhoResultado = lista.getTamanho();
        assertEquals(stringEsperada, stringResultado);
        assertEquals(tamanhoEsperado, tamanhoResultado);
    }

    @Test
    public void testObterElemento() {
        int resultado;
        int esperado = 20;
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.obterElemento(3);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testObterElementoExcecao() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ListaEstatica lista = new ListaEstatica();
            lista.inserir(5);
            lista.inserir(10);
            lista.inserir(15);
            lista.inserir(20);
            lista.obterElemento(5);
        });
    }

    @Test
    public void testLiberar() {
        boolean resultado;
        boolean esperado = true;
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.liberar();
        resultado = lista.estaVazia();
        assertEquals(esperado, resultado);
    }

}
