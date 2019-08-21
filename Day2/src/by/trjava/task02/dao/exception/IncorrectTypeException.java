package by.trjava.task02.dao.exception;

import by.trjava.task02.entity.Edition;

public class IncorrectTypeException extends Exception {
    public IncorrectTypeException(String message){
        super(message);
    }
    public IncorrectTypeException (String message, Throwable cause) {
        super(message, cause);
    }
}

