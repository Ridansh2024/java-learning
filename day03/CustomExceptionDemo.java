// Day 3: Custom Exception + Real-World Example

// TODO 1: Create a custom exception class
// InsufficientBalanceException extends Exception
// Should have a message like "Insufficient balance! Available: ₹XXXX, Requested: ₹XXXX"

class InsufficientBalanceException extends Exception {
    // TODO: Constructor that takes available and requested amount
    public InsufficientBalanceException(double available, double requested) {
        // Hint: super("your message here");
        super("Insufficient balance! Available: ₹" + available + ", Requested: ₹" + requested);
    }
}

// TODO 2: Create InvalidAgeException (unchecked — extends RuntimeException)
class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        // your code here
        super(message);
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
        if(amount > balance) {
            throw new InsufficientBalanceException(this.balance, amount);
        }
        this.balance -= amount;
    }

    // TODO: deposit() method — throw IllegalArgumentException if amount <= 0
    public void deposit(double amount) {
        // your code here
        if(amount < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive!");
        }
        this.balance += amount;
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
        this.name = name;
        this.age = age;
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Custom Exception Demo ===");
        BankAccount bankAccount = new BankAccount("John Doe", 5000);
        bankAccount.withdraw(10000);
        bankAccount.deposit(3000);
        bankAccount.withdraw(2000);
        EmployeeWithValidation employeeWithValidation = new EmployeeWithValidation("John Doe", 25);
        EmployeeWithValidation employeeWithValidation1 = new EmployeeWithValidation("John Doe", 15);

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
