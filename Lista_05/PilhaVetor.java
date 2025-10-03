package Lista_05;

public class PilhaVetor<T> implements Pilha<T> {
    private T[] info;
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.info = (T[]) new Object[limite];
        this.limite = limite;
        this.tamanho = 0;
    }

    @Override
    public void push(T valor) {
        if (tamanho == limite) {
            throw new PilhaCheiaException();
        }
        info[tamanho] = valor;
        this.tamanho++;
    }

    @Override
    public T pop() {
        T valor = peek();
        tamanho--;
        info[tamanho] = null;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        this.info = (T[]) new Object[this.limite];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        String texto = "[ ";
        for (int i = tamanho; i > 0; i--) {
            if (i == 1) {
                texto += info[i - 1];
            } else {
                texto += info[i - 1] + ", ";
            }
        }
        texto +=  " ]";
        return texto;
    }

    public void concatenar(PilhaVetor<T> p) {
        if (this.tamanho + p.tamanho > this.limite) {
            throw new PilhaCheiaException("A pilha não tem espaço suficiente para armazenar todos os dados.");
        }
        for (int i = 0; i < p.tamanho; i++) {
            this.push(p.info[i]);
        }
    }

}
