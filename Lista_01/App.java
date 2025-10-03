package Lista_01;

public class App {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();
        for (int i = 1; i <= 50; i++) {
            lista.inserir(i);
        }

        for (int i = 30; i <= 50; i++) {
            lista.retirar(i);
        }

        System.out.println(lista.getTamanho());
        System.out.println(lista.getInfoLength());
    }
}
