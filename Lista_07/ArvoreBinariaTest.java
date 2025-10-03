package Lista_07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArvoreBinariaTest {

    @Test
    public void testarArvoreVaziaTrue() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        assertEquals(true, arvore.estaVazia());
    }

    @Test
    public void testarArvoreVaziaFalse() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(new NoArvoreBinaria<Integer>(5));
        assertEquals(false, arvore.estaVazia());
    }

    @Test
    public void testarRepresentacaoTextual() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(2, null, no1);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3, no2, no3);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(1, no4, no5);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no6);
        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
    }

    @Test
    public void testarBuscarValorRaiz() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(2, null, no1);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3, no2, no3);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(1, no4, no5);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no6);
        assertEquals(true, arvore.pertence(1));
    }

    @Test
    public void testarBuscarValorNoInterno() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(2, null, no1);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3, no2, no3);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(1, no4, no5);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no6);
        assertEquals(true, arvore.pertence(3));
    }

    @Test
    public void testarBuscarValorNoFolha() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(2, null, no1);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3, no2, no3);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(1, no4, no5);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no6);
        assertEquals(true, arvore.pertence(6));
    }

    @Test
    public void testarBuscarValorInexistente() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(2, null, no1);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3, no2, no3);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(1, no4, no5);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no6);
        assertEquals(false, arvore.pertence(10));
    }

    @Test
    public void testarContarNos() {
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(4);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(5);
        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(6);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(2, null, no1);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(3, no2, no3);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<Integer>(1, no4, no5);
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no6);
        assertEquals(6, arvore.contarNos());
    }

}
