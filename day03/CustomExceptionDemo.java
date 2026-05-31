// Day 3: Custom Exception + Real-World Example

// TODO 1: Create a custom exception class
// InsufficientBalanceException extends Exception
// Should have a message like "Insufficient balance! Available: ₹XXXX, Requested: ₹XXXX"

class InsufficientBalanceException extends Exception {
    // TODO: Constructor that takes available and requested amount
    public InsufficientBalanceException(double available, double requested) {
        // Hint: super("your message here");
    }
}

// TODO 2: Create InvalidAgeException (unchecked — extends RuntimeException)
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        // your code here
    }
}

// TODO 3: BankAccount class that uses custom exceptions
class BankAccount {
    private String holder;
    private double balance;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    // TODO: withdraw() method — throw InsufficientBalanceException if amount > balance
    public void withdraw(double amount) throws InsufficientBalanceException {
        // your code here
    }

    // TODO: deposit() method — throw IllegalArgumentException if amount <= 0
    public void deposit(double amount) {
        // your code here
    }

    public double getBalance() {
        return balance;
    }
}

// TODO 4: Employee class with age validation
class EmployeeWithValidation {
    private String name;
    private int age;

    // TODO: Constructor — throw InvalidAgeException if age < 18 or > 65
    public EmployeeWithValidation(String name, int age) {
        // your code here
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Custom Exception Demo ===");

        // TODO: Test BankAccount
        // Create account with ₹5000
        // Try to withdraw ₹10000 — should throw InsufficientBalanceException
        // Deposit ₹3000
        // Withdraw ₹2000 — should succeed

        // TODO: Test EmployeeWithValidation
        // Create employee with age 25 — should work
        // Create employee with age 15 — should throw InvalidAgeException
    }
}
