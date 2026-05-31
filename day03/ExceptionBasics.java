// Day 3: Exception Handling — try/catch/finally/throw/throws

public class ExceptionBasics {

    // TODO 1: Handle ArithmeticException (divide by zero)
    public static int divideNumbers(int a, int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return result;
    }

    // TODO 2: Handle ArrayIndexOutOfBoundsException
    public static void accessArray(int[] arr, int index) {
        // Use try-catch here
        // Print element if valid index, print error if invalid
        try {
            System.out.println("Element at index " + index +": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
            return;
        }
    }

    // TODO 3: Handle NumberFormatException (String to int)
    public static int parseNumber(String str) {
        // Use try-catch here
        // Convert string to int, return -1 if invalid
        int result = 0;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
            return -1;
        }
        return result;
    }

    // TODO 4: Demonstrate finally block
    public static void finallyDemo() {
        // try-catch-finally
        // finally block should print "This always runs!"
        try {
            System.out.println("Inside Try block");
        } catch (Exception e) {
            System.out.println("Inside Catch block");
        } finally {
            System.out.println("It is called everyTime");
        }
    }

    // TODO 5: Use 'throws' keyword — declare that method can throw exception
    public static void riskyMethod() throws Exception {
         throw new Exception("Something went wrong!");
    }

    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===");

        // TODO: Call all methods above and test them
         divideNumbers(10, 0);
         divideNumbers(10, 2);
         accessArray(new int[]{1,2,3}, 5);
         parseNumber("abc");
         parseNumber("123");
         finallyDemo();
    }
}
