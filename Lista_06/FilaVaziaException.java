package Lista_06;

public class FilaVaziaException extends RuntimeException {
    public FilaVaziaException() {
        super();
    }

    public FilaVaziaException(String mensagem) {
        super(mensagem);
    }
}
