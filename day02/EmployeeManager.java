// Day 2: Collections — ArrayList + HashMap

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeManager {

    // Store employees in a list
    private List<Employee> employeeList = new ArrayList<>();

    // Store employees by ID for quick lookup
    private HashMap<Integer, Employee> employeeMap = new HashMap<>();

    private int nextId = 1;

    // TODO: Add employee — add to both list and map
    public void addEmployee(Employee emp) {
        // your code here
    }

    // TODO: Remove employee by ID
    public void removeEmployee(int id) {
        // your code here
    }

    // TODO: Search employee by ID (use HashMap)
    public Employee searchById(int id) {
        // your code here
        return null;
    }

    // TODO: Search employees by department (use ArrayList + loop/stream)
    public List<Employee> searchByDepartment(String department) {
        // your code here
        return new ArrayList<>();
    }

    // TODO: Get all employees sorted by salary (use Comparator)
    public List<Employee> getAllSortedBySalary() {
        // Hint: use Collections.sort() or list.sort() with Comparator
        return new ArrayList<>();
    }

    // TODO: Print all employees
    public void printAll() {
        // your code here
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // TODO: Add 5 employees
        // TODO: Search by ID
        // TODO: Search by department
        // TODO: Remove one employee
        // TODO: Print all sorted by salary

        System.out.println("=== Employee Manager ===");
    }
}
