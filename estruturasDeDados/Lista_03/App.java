package Lista_03;

public class App {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.inserir("0");
        lista.inserir("1");
        lista.inserir("2");
        lista.inserir("3");
        lista.inserir("4");
        lista.inserir("5");
        lista.inserir("6");
        lista.inserir("7");
        lista.inserir("8");
        lista.inserir("9");
        System.out.println(lista.toString());
        System.out.println(lista.obterComprimento());
        System.out.println(lista.obterNo(5));
    }
}
