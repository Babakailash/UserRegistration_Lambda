package user.registration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidate {
    boolean match;
    private static final String FName_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String LName_PATTERN = "^[A-Z][a-z]{3,}$";
    private static final String Email_PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private static final String Mob_PATTERN = "^[0-9]{2}\\s[0-9]{10}$";
    private static final String Pass_PATTERN = "^(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";

    Check validateFirstName = (String first) -> {
        try {

            Pattern pattern = Pattern.compile(FName_PATTERN);
            Matcher matcher = pattern.matcher(first);
            if (first.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "Name can not be Empty");
            } else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter name starts with capital latter and min 3 char long");
            }
            return match;
        } catch (NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "please enter proper name");
        }
    };

    Check validateLastName = (String last) -> {
        try {
            Pattern pattern = Pattern.compile(LName_PATTERN);
            boolean match = pattern.matcher(last).matches();
            if (last.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "Last name cannot be empty");
            } else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter name starts with capital latter and min 3 char long");
            }
        } catch (NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Last name cannot be null");
        }
        return match;
    };

    Check validateEmail = (String email) -> {
        try {
            Pattern pattern = Pattern.compile(Email_PATTERN);
            match = pattern.matcher(email).matches();
            if (email.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "email cannot be empty");
            }
            else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter proper email");
            }
        }
        catch (NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Email cannot be empty");
        }
        return match;
    };

    Check validatMob_PATTERN = (String mob) -> {
        try {
            Pattern pattern = Pattern.compile(Mob_PATTERN);
            match = pattern.matcher(mob).matches();
            if (mob.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "Please Enter Mobile No");
            }
            else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "Enter proper 10 digit mobile number ie. '91 9895856852' with country code");
            }
        }
        catch(NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Number can not be empty");
        }
        return match;
    };

    Check validatePassword = (String pass) -> {
        try {
            Pattern pattern = Pattern.compile(Pass_PATTERN);
            match = pattern.matcher(pass).matches();
            if (pass.length() == 0) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_EMPTY, "please enter password");
            }
            else if (!match) {
                throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_INVALID, "please enter valid password");
            }
        }
        catch(NullPointerException e) {
            throw new ValidateUserException(ValidateUserException.ExceptionType.ENTERED_NULL, "Password can not be null");
        }
        return match;
    };
}

