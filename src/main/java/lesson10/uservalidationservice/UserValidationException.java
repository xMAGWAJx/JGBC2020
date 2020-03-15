package lesson10.uservalidationservice;

public class UserValidationException extends RuntimeException {

    public UserValidationException(String message) {
        super(message);
    }
}
