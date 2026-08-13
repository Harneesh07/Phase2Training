class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

class Practise {

    public static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Age is valid");
    }
}

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Finally executed");
        }

        try {
            Practise.checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program continues...");
    }
}