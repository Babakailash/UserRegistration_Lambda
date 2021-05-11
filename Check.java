package user.registration;

public interface Check {
    boolean check(String value) throws ValidateUserException;
}
