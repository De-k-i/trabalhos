package Lista_01;

public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int[] temp = new int[info.length + 10];
        for (int i = 0; i < info.length; i++) {
            temp[i] = info[i];
        }
        info = temp;
    }

    public void inserir(int valor) {
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

    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {
        int posicao = buscar(valor);
        if (posicao > -1) {
            for (int i = posicao + 1; i < tamanho; i++) {
                info[i - 1] = info[i];
            }
        }
        tamanho--;
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao) {
        if (posicao > tamanho || posicao < 0) {
            throw new IndexOutOfBoundsException("Posição inválida.");
        }
        return info[posicao];
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

    public int getInfoLength() {
        return info.length;
    }
}
