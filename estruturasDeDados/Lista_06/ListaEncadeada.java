package Lista_06;

public class ListaEncadeada<T> {

    private NoLista<T> primeiro;
    private NoLista<T> ultimo;

    public ListaEncadeada() {

    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoLista<T> novo = new NoLista<T>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        this.primeiro = novo;
    }

    public void inserirNoFinal(T valor) {
        NoLista<T> novo = new NoLista<T>();
        novo.setInfo(valor);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public NoLista<T> buscar(T valor) {
        NoLista<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoLista<T> anterior = null;
        NoLista<T> p = primeiro;
        while (p != null && !p.getInfo().equals(valor)) {
            anterior = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (p == primeiro) {
                this.primeiro = p.getProximo();
            } else {
                anterior.setProximo(p.getProximo());
            }
        }
    }

    public int obterComprimento() {
        int comprimento = 0;
        NoLista<T> p = primeiro;
        while (p != null) {
            p = p.getProximo();
            comprimento++;
        }
        return comprimento;
    }

    public NoLista<T> obterNo(int idx) {
        NoLista<T> p = primeiro;
        if (idx < 0 || idx > this.obterComprimento() - 1) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < idx; i++) {
            p = p.getProximo();
        }
        return p;
    }

    public void liberar() {
        primeiro = null;
    }

    @Override
    public String toString() {
        String texto;
        NoLista<T> p = primeiro;
        if (p == null) {
            texto = "[ ]";
        } else {
            texto = "[ ";
            while (p != null) {
                if (p.getProximo() == null) {
                    texto += p.getInfo() + " ]";
                    p = p.getProximo();
                } else {
                    texto += p.getInfo() + ", ";
                    p = p.getProximo();
                }
            }
        }
        return texto;
    }
}
