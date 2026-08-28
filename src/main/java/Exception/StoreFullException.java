package Exception;

public class StoreFullException extends RuntimeException {
    public StoreFullException(String message) {
        super(message);
    }
}
