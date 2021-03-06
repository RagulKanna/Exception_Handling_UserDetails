package Assignment;

import Assignment.trycatch.MyException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateDetailsTest {

    public static String regex;

    public static boolean name(String name) {

        regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean checkFirstname(String name) throws MyException {
        try {
            if (!name(name)) {
                throw new MyException("\nInvalid Firstname");
            } else {
                System.out.println("\nyou entered valid Firstname");
            }
            return name(name);
        } catch (MyException me) {

            System.out.println("\nException occured: " + me);
        }
        return name(name);
    }

    public static boolean checkLastname(String name) throws MyException {
        try {
            if (!name(name)) {
                throw new MyException("\nInvalid Lastname");
            } else {
                System.out.println("\nyou entered valid Lastname");
            }
            return name(name);
        } catch (MyException me) {

            System.out.println("\nException occured: " + me);
        }
        return name(name);
    }

    public static boolean mail(String mailID) {
        regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailID);
        return matcher.matches();
    }

    public static boolean checkMail(String mail) throws MyException {
        try {
            if (!mail(mail)) {
                throw new MyException("\nInvalid MailID");
            } else {
                System.out.println("\nyou entered valid MailID");
            }
            return mail(mail);
        } catch (MyException me) {

            System.out.println("\nException occured: " + me);
        }
        return mail(mail);
    }

    public static boolean phonenumber(String phonenumber) {
        regex = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phonenumber);
        return matcher.matches();
    }

    public static boolean checkPhonenumber(String number) throws MyException {
        try {
            if (!phonenumber(number)) {
                throw new MyException("\nInvalid Phone Number");
            } else {
                System.out.println("\nyou entered valid Phone Number");
            }
            return phonenumber(number);
        } catch (MyException me) {

            System.out.println("\nException occured: " + me);
        }
        return phonenumber(number);
    }

    public static boolean password(String password) {
        regex = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean checkPassword(String password) throws MyException {
        try {
            if (!password(password)) {
                throw new MyException("\nInvalid Password");
            } else {
                System.out.println("\nyou entered valid Password");
            }
            return password(password);
        } catch (MyException me) {

            System.out.println("\nException occured: " + me);
        }
        return password(password);
    }
}

