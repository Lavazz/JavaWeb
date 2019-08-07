package by.trjava.task02.exception;

public class WrongPathException extends  Exception {
    public  WrongPathException(String message){
        super(message);
    }
    public WrongPathException(String message, Throwable cause) {
        super(message, cause);
    }
}
