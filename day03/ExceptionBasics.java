// Day 3: Exception Handling — try/catch/finally/throw/throws

public class ExceptionBasics {

    // TODO 1: Handle ArithmeticException (divide by zero)
    public static void divideNumbers(int a, int b) {
        // Use try-catch here
        // Print result if success, print error message if divide by zero
    }

    // TODO 2: Handle ArrayIndexOutOfBoundsException
    public static void accessArray(int[] arr, int index) {
        // Use try-catch here
        // Print element if valid index, print error if invalid
    }

    // TODO 3: Handle NumberFormatException (String to int)
    public static int parseNumber(String str) {
        // Use try-catch here
        // Convert string to int, return -1 if invalid
        return -1;
    }

    // TODO 4: Demonstrate finally block
    public static void finallyDemo() {
        // try-catch-finally
        // finally block should print "This always runs!"
    }

    // TODO 5: Use 'throws' keyword — declare that method can throw exception
    public static void riskyMethod() throws Exception {
        // throw new Exception("Something went wrong!");
    }

    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===");

        // TODO: Call all methods above and test them
        // divideNumbers(10, 0);
        // divideNumbers(10, 2);
        // accessArray(new int[]{1,2,3}, 5);
        // parseNumber("abc");
        // parseNumber("123");
        // finallyDemo();
    }
}
