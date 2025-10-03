package Lista_05;

public class PilhaVaziaException extends RuntimeException {
    public PilhaVaziaException() {
        System.out.println("A pilha está vazia.");
    }

    public PilhaVaziaException(String mensagem) {
        System.out.println(mensagem);
    }
}
