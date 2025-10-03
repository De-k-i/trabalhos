package Lista_04;

public class App {
    public static void main(String[] args) {
        ListaDupla<Integer> lista = new ListaDupla<>();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        System.out.println(toStringInverso(lista));
    }

    public static String toStringInverso(ListaDupla<Integer> lista) {
        NoListaDupla<Integer> p = lista.getPrimeiro();
        String texto = "";
        while (p.getProximo() != null) {
            p = p.getProximo();
        }
        texto += "[ ";
        while (p != null) {
            if (p.getAnterior() == null) {
                texto += p.getInfo() + " ] ";
                p = p.getAnterior();
            } else {
                texto += p.getInfo() + ", ";
                p = p.getAnterior();
            }
        }
        return texto;
    }

}
