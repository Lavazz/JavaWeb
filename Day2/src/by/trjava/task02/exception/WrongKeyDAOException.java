package by.trjava.task02.exception;

public class WrongKeyDAOException extends Exception {
      public WrongKeyDAOException(String message){
            super(message);
        }
    public WrongKeyDAOException (String message, Throwable cause) {
            super(message, cause);
        }


    }
