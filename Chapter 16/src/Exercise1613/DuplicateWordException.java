package Exercise1613;

public class DuplicateWordException extends Exception {
    public DuplicateWordException() {
        super();
    }

    public DuplicateWordException(String message) {
        super(message);
    }

    public DuplicateWordException(String message, Throwable cause){
        super(message, cause);
    }

    public DuplicateWordException(Throwable cause) {
        super(cause);
    }

}
