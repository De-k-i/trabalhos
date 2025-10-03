package Lista_03;

public class NoLista<T> {
    
    private T info;
    private NoLista<T> proximo;

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setProximo(NoLista<T> proximo) {
        this.proximo = proximo;
    }

    public NoLista<T> getProximo() {
        return proximo;
    }
}
