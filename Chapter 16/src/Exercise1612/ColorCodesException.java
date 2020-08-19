package Exercise1612;

public class ColorCodesException extends Exception {
    public ColorCodesException () {
        super();
    }

    public ColorCodesException (String message) {
        super(message);
    }

    public ColorCodesException (String message, Throwable cause) {
        super(message, cause);
    }

    public ColorCodesException (Throwable cause) {
        super(cause);
    }
}
