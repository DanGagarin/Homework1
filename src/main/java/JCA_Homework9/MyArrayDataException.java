package JCA_Homework9;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException() {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
