package Lista_04;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ListaDuplaTeste {

    public static String toStringInverso(ListaDupla<Integer> lista) {
        NoListaDupla<Integer> p = lista.getPrimeiro();
        String texto = "";
        while (p.getProximo() != null) {
            p = p.getProximo();
        }
        texto += "[ ";
        while (p != null) {
            if (p.getAnterior() == null) {
                texto += p.getInfo() + " ]";
                p = p.getAnterior();
            } else {
                texto += p.getInfo() + ", ";
                p = p.getAnterior();
            }
        }
        return texto;
    }

    @Test
    public void testarInclusaoDeElementosValidandoProximosAnteriores() {
        String resultado;
        String esperado = "[ 20, 15, 10, 5 ]";
        String resultadoInverso;
        String esperadoInverso = "[ 5, 10, 15, 20 ]";
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.toString();
        resultadoInverso = toStringInverso(lista);
        assertEquals(esperado, resultado);
        assertEquals(esperadoInverso, resultadoInverso);
    }

    @Test
    public void buscarElementoNoInicioDaEstrutura() {
        NoListaDupla<Integer> esperado;
        NoListaDupla<Integer> resultado;
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        esperado = lista.getPrimeiro();
        resultado = lista.buscar(20);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarBuscarElementoNoMeioDaEstrutura() {
        NoListaDupla<Integer> esperado;
        NoListaDupla<Integer> resultado;
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        esperado = lista.getPrimeiro();
        lista.inserir(15);
        lista.inserir(20);
        resultado = lista.buscar(10);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testarRemoverElementoNoInicioDaLista() {
        String esperado = "[ 15, 10, 5 ]";
        String resultado;
        String esperadoInverso = "[ 5, 10, 15 ]";
        String resultadoInverso;
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        resultado = lista.toString();
        resultadoInverso = toStringInverso(lista);
        assertEquals(esperado, resultado);
        assertEquals(esperadoInverso, resultadoInverso);
    }

    @Test
    public void testarRemoverElementoNoMeioDaLista() {
        String esperado = "[ 20, 15, 5 ]";
        String resultado;
        String esperadoInverso = "[ 5, 15, 20 ]";
        String resultadoInverso;
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(10);
        resultado = lista.toString();
        resultadoInverso = toStringInverso(lista);
        assertEquals(esperado, resultado);
        assertEquals(esperadoInverso, resultadoInverso);
    }

    @Test
    public void testarRemoverElementoNoFimDaLista() {
        String esperado = "[ 20, 15, 10 ]";
        String resultado;
        String esperadoInverso = "[ 10, 15, 20 ]";
        String resultadoInverso;
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(5);
        resultado = lista.toString();
        resultadoInverso = toStringInverso(lista);
        assertEquals(esperado, resultado);
        assertEquals(esperadoInverso, resultadoInverso);
    }

    @Test
    public void testarLiberar() {
        NoListaDupla<Integer> teste5;
        NoListaDupla<Integer> teste10;
        NoListaDupla<Integer> teste15;
        NoListaDupla<Integer> teste20;
        NoListaDupla<Integer> resultadoProximo;
        NoListaDupla<Integer> resultadoAnterior;
        NoListaDupla<Integer> esperado = null;
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        teste5 = lista.buscar(5);
        teste10 = lista.buscar(10);
        teste15 = lista.buscar(15);
        teste20 = lista.buscar(20);
        lista.liberar();
        resultadoAnterior = teste5.getAnterior();
        resultadoProximo = teste5.getProximo();
        assertEquals(esperado, resultadoAnterior);
        assertEquals(esperado, resultadoProximo);
        resultadoAnterior = teste10.getAnterior();
        resultadoProximo = teste10.getProximo();
        assertEquals(esperado, resultadoAnterior);
        assertEquals(esperado, resultadoProximo);
        resultadoAnterior = teste15.getAnterior();
        resultadoProximo = teste15.getProximo();
        assertEquals(esperado, resultadoAnterior);
        assertEquals(esperado, resultadoProximo);
        resultadoAnterior = teste20.getAnterior();
        resultadoProximo = teste20.getProximo();
        assertEquals(esperado, resultadoAnterior);
        assertEquals(esperado, resultadoProximo);
    }

}
