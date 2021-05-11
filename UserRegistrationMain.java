package user.registration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain  {
    public static void main(String args[]) {

        Scanner c = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String first = c.nextLine();
        FirstName name = new FirstName();
        name.FirstName(first);

        Scanner c1 = new Scanner(System.in);
        System.out.println("Enter Last Name: ");
        String last = c1.nextLine();
        LastName name1 = new LastName();
        name1.LastName(last);

        Scanner c11 = new Scanner(System.in);
        System.out.println("Enter the Email: ");
        String email = c11.nextLine();
        Email mail =new Email();
        mail.Email(email);

        Scanner c111 = new Scanner(System.in);
        System.out.println("Enter Mobile Number: ");
        String mob = c111.nextLine();
        MobNum num =new MobNum();
        num.MobNum(mob);


        Scanner c1111 = new Scanner(System.in);
        System.out.println("Enter Password: ");
        String pass = c1111.nextLine();
        Password passw = new Password();
        passw.Password(pass);


    }

}


class FirstName {
    private static final String PATTERN = "^[A-Z][a-z]{3,}$";

    void  FirstName (String first) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(first);
        if (matcher.matches()) {
            System.out.println("Username " + first + " is valid");
        } else {
            System.out.println("Username " + first + " is invalid");
        }
    }
}

class LastName {
    private static final String PATTERN = "^[A-Z][a-z]{3,}$";

    void LastName(String last) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(last);
        if (matcher.matches()) {
            System.out.println("Username " + last + " is valid");
        } else {
            System.out.println("Username " + last + " is invalid");
        }
    }
}

class Email {
    private static final String PATTERN = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

    void Email(String email) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Username " + email + " is valid");
        } else {
            System.out.println("Username " + email + " is invalid");
        }
    }
}

class MobNum {
    private static final String PATTERN = "^[0-9]{2}\\s[0-9]{10}$";

    void MobNum (String mob) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(mob);
        if (matcher.matches()) {
            System.out.println("Username " + mob + " is valid");
        } else {
            System.out.println("Username " + mob + " is invalid");
        }
    }
}

class Password {
    private static final String PATTERN = "^(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$";

    void Password(String pass) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(pass);
        if (matcher.matches()) {
            System.out.println("Username " + pass + " is valid");
        } else {
            System.out.println("Username " + pass + " is invalid");
        }
    }
}
