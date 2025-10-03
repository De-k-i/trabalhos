package Lista_02;

public class App {
    public static void main(String[] args) {
        ListaEstatica<String> lista = new ListaEstatica<>();
        lista.inserir("tomate");
        lista.inserir("maçã");
        lista.inserir("banana");
        lista.inserir("pera");
        lista.inserir("limão");
        System.out.println(lista.getTamanho());
        System.out.println(lista.obterElemento(3));
        System.out.println(lista.toString());
        lista.inverter();
        System.out.println(lista.toString());
    }
}
