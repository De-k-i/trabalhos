package Lista_04;

public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla<T> novo = new NoListaDupla<T>();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public NoListaDupla<T> buscar(T valor) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla<T> p = buscar(valor);
        if (p != null) {
            if (primeiro.equals(p)) {
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }
            if (p.getProximo() != null) {
                p.getProximo().setAnterior(p.getAnterior());
            }
        }
    }

    public void exibirOrdemInversa() {
        while (primeiro.getProximo() != null) {
            primeiro = primeiro.getProximo();
        }
        System.out.print("[ ");
        while (primeiro != null) {
            if (primeiro.getAnterior() == null) {
                System.out.println(primeiro.getInfo() + " ] ");
                primeiro = primeiro.getAnterior();
            } else {
                System.out.print(primeiro.getInfo() + ", ");
                primeiro = primeiro.getAnterior();
            }
        }
    }

    public void liberar() {
        while (primeiro.getProximo() != null) {
            NoListaDupla<T> proximo = primeiro.getProximo();
            primeiro.setAnterior(null);
            primeiro.setProximo(null);
            primeiro.setInfo(null);
            primeiro = proximo;
        }
        primeiro.setAnterior(null);
        primeiro.setProximo(null);
        primeiro.setInfo(null);
    }

    @Override
    public String toString() {
        String texto;
        NoListaDupla<T> p = primeiro;
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
