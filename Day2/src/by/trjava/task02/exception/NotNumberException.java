package by.trjava.task02.exception;

public class NotNumberException extends Exception {
    public NotNumberException(String message){
        super(message);
    }
    public NotNumberException (String message, Throwable cause) {
        super(message, cause);
    }
}
