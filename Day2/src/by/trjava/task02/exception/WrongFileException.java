package by.trjava.task02.exception;

public class WrongFileException extends Exception {
    public WrongFileException(String message){
        super(message);
    }
    public WrongFileException (String message, Throwable cause) {
        super(message, cause);
    }

}
