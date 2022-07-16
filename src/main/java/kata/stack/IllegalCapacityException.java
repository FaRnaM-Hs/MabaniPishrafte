package kata.stack;

public class IllegalCapacityException extends RuntimeException {

    public IllegalCapacityException (String message) {
        super(message);
    }
}
