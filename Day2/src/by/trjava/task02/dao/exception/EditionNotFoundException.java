package by.trjava.task02.dao.exception;

public class EditionNotFoundException extends Exception {
    public EditionNotFoundException(String message){
        super(message);
    }
    public EditionNotFoundException (String message, Throwable cause) {
        super(message, cause);
    }
}
