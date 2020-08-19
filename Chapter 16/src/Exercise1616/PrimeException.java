package Exercise1616;

public class PrimeException extends Exception {
    public PrimeException () {
        super();
    }

    public PrimeException (String message) {
        super(message);
    }

    public PrimeException (String message, Throwable cause) {
        super(message, cause);
    }

    public PrimeException (Throwable cause) {
        super(cause);
    }
}
