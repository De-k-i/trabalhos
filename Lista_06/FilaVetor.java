package Lista_06;

public class FilaVetor<T> implements Fila<T> {
    private Object[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        info = new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException("A fila está cheia");
        }
        int pos = (inicio + tamanho) % limite;
        info[pos] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException("A fila está vazia.");
        }
        return (T) info[inicio];
    }

    @Override
    public T retirar() {
        T valor = peek();
        info[inicio] = null;
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        info = new Object[limite];
        tamanho = 0;
        inicio = 0;
    }

    @SuppressWarnings("unchecked")
    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> f3 = new FilaVetor<>(this.getLimite() + f2.getLimite());
        int pos = inicio;
        for (int i = 0; i < tamanho; i++) {
            f3.inserir((T) this.info[pos]);
            pos = (pos + 1) % limite;
        }
        pos = f2.inicio;
        for (int i = 0; i < f2.tamanho; i++) {
            f3.inserir((T) f2.info[pos]);
            pos = (pos + 1) % limite;
        }
        return f3;
    }
    
    @Override
    public String toString() {
        String texto = "[ ";
        int pos = inicio;
        for (int i = 0; i < tamanho; i++) {
            if (i == tamanho - 1) {
                texto += info[pos];
            } else {
                texto += info[pos] + ", ";
                pos = (pos + 1) % limite;
            }
        }
        texto += " ]";
        return texto;
    }

    public int getLimite() {
        return limite;
    }
}
