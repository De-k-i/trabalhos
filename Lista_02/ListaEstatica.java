package Lista_02;

public class ListaEstatica<T> {
    private Object[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new Object[10];
        tamanho = 0;
    }

    private void redimensionar() {
        Object[] temp = new Object[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            temp[i] = info[i];
        }
        info = temp;
    }

    public void inserir(T valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(T valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(T valor) {
        int posicao = buscar(valor);
        if (posicao > -1) {
            for (int i = posicao + 1; i < tamanho; i++) {
                info[i - 1] = info[i];
            }
        }
        tamanho--;
    }

    public void liberar() {
        info = new Object[10];
        tamanho = 0;
    }

    public T obterElemento(int posicao) {
        if (posicao > tamanho || posicao < 0) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        return (T) info[posicao];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int getTamanho() {

        return tamanho;
    }

    public String toString() {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            if (i == tamanho - 1) {
                texto += info[i];
            } else {
                texto += info[i] + ",";
            }
        }
        return texto;
    }

    public void inverter() {
        Object tmp;
        for (int i = 0; i < tamanho / 2; i++) {
            tmp = info[i];
            info[i] = info[tamanho - 1 - i];
            info[tamanho - 1 - i] = tmp;
        }
    }
}
