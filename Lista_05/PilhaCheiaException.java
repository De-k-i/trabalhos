package Lista_05;

public class PilhaCheiaException extends RuntimeException {
    public PilhaCheiaException() {
        System.out.println("A pilha está cheia.");
    }

    public PilhaCheiaException(String mensagem) {
        System.out.println(mensagem);
    }
}
