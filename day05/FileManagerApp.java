// Day 5: File Manager Application (Mini Project)
// A simple console-based file manager using Java I/O

import java.io.*;
import java.util.*;

public class FileManagerApp {

    private static final String DATA_FILE = "employees.txt";

    // TODO 1: Add employee to file
    // Format: id,name,department,salary
    public static void addEmployee(int id, String name, String dept, double salary) {
        // Append to file in CSV format
        // Example line: "101,Digambar,Engineering,50000.0"
    }

    // TODO 2: Display all employees from file
    public static void displayAll() {
        // Read file line by line
        // Split each line by comma
        // Print formatted output
    }

    // TODO 3: Search employee by name
    public static void searchByName(String name) {
        // Read file, check if line contains the name
        // Print matching employees
    }

    // TODO 4: Delete employee by ID
    public static void deleteById(int id) {
        // Read all lines
        // Write back only lines that DON'T match the id
        // Hint: Use a temp file or store in list then rewrite
    }

    // TODO 5: Update employee salary by ID
    public static void updateSalary(int id, double newSalary) {
        // Read all lines
        // Find matching ID, update salary
        // Write back all lines
    }

    // TODO 6: Count total employees
    public static int countEmployees() {
        // Count number of lines in file
        return 0;
    }

    // Menu-driven application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Employee File Manager ===");

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All");
            System.out.println("3. Search by Name");
            System.out.println("4. Delete by ID");
            System.out.println("5. Update Salary");
            System.out.println("6. Count Employees");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Department: ");
                    String dept = scanner.nextLine();
                    System.out.print("Salary: ");
                    double salary = scanner.nextDouble();
                    addEmployee(id, name, dept, salary);
                    System.out.println("Employee added!");
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    searchByName(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    deleteById(scanner.nextInt());
                    break;
                case 5:
                    System.out.print("Enter ID: ");
                    int uid = scanner.nextInt();
                    System.out.print("New Salary: ");
                    double newSal = scanner.nextDouble();
                    updateSalary(uid, newSal);
                    break;
                case 6:
                    System.out.println("Total: " + countEmployees());
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
