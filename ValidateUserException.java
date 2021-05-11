package user.registration;

public class ValidateUserException extends Exception{
    enum ExceptionType {
        ENTERED_INVALID, ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType type;

    public ValidateUserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}