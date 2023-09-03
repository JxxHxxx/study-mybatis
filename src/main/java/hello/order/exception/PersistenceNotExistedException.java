package hello.order.exception;

public class PersistenceNotExistedException extends RuntimeException {
    public PersistenceNotExistedException(String message) {
        super(message);
    }
}
