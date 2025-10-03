package Lista_07;

public class NoArvoreBinaria<T> {
    private T info;
    private NoArvoreBinaria<T> esquerda;
    private NoArvoreBinaria<T> direita;

    public NoArvoreBinaria(T valor) {
        info = valor;
    }

    public NoArvoreBinaria(T valor, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
        info = valor;
        esquerda = esq;
        direita = dir;
    }

    public void setInfo(T valor) {
        info = valor;
    }

    public T getInfo() {
        return info;
    }

    public NoArvoreBinaria<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvoreBinaria<T> esq) {
        esquerda = esq;
    }

    public NoArvoreBinaria<T> getDireita() {
        return direita;
    }

    public void setDireita(NoArvoreBinaria<T> dir) {
        esquerda = dir;
    }

}
