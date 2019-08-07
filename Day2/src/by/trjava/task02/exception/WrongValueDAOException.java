package by.trjava.task02.exception;

public class WrongValueDAOException extends Exception {
    public WrongValueDAOException(String message){
        super(message);
    }
    public WrongValueDAOException (String message, Throwable cause) {
        super(message, cause);
    }

}
