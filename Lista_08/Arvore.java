package Lista_08;

public class Arvore<T> {
    
    private NoArvore<T> raiz;

    public Arvore() {

    }

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public String toString() {
        if (raiz == null) {
            return "";
        } else {
            return obterRepresentacaoTextual(raiz);
        }
    }

    private String obterRepresentacaoTextual(NoArvore<T> no) {
            String texto = "<" + no.getInfo();
            NoArvore<T> p = no.getPrimeiro();
            while (p != null) {
                texto += obterRepresentacaoTextual(p);
                p = p.getProximo();
            }
            texto += ">";
            return texto;
    }

    public boolean pertence(T info) {
        if (raiz == null) {
            return false;
        } else {
            return pertence(raiz, info);
        }
    }

    private boolean pertence(NoArvore<T> no, T info) {
        if (no.getInfo().equals(info)) {
            return true;
        } else {
            NoArvore<T> p = no.getPrimeiro();
            while (p != null) {
                if (pertence(p, info)) {
                    return true;
                }
                p = p.getProximo();
            }
            return false;
        }
    }

    public int contarNos() {
        if (raiz == null) {
            return 0;
        } else {
            return 1 + contarNos(raiz);
        }
    }

    private int contarNos(NoArvore<T> no) {
        int cont = 0;
        NoArvore<T> p = no.getPrimeiro();
        while (p != null) {
            cont += 1 + contarNos(p);
            p = p.getProximo();
        }
        return cont;
    }

}