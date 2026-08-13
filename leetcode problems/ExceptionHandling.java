
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }

        System.out.println("Eligible.");
    }



    static void method1() {
        method2();
    }

    static void method2() {
        method3();
    }

    static void method3() {

        int number = 10 / 0;
    }


    public static void main(String[] args) {



        try {

            int[] numbers = {10, 20, 30};

            System.out.println(numbers[5]);

        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index is invalid.");
        }
        catch (ArithmeticException e) {

            System.out.println("Arithmetic error occurred.");
        }
        catch (Exception e) {

            System.out.println("Some other exception occurred.");
        }




        try {

            int result = 10 / 2;

            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");
        }
        finally {

            System.out.println("Finally block always executes.");
        }




        try {

            int result = 10 / 0;

            System.out.println(result);

        }
        catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");
        }



        try {

            checkAge(16);

        }
        catch (InvalidAgeException e) {

            System.out.println("Custom Exception: " + e.getMessage());
        }




        try {

            method1();

        }
        catch (ArithmeticException e) {

            System.out.println(
                    "Exception propagated to main."
            );
        }


        System.out.println("Program continues...");
    }
}