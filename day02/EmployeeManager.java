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

    // Add employee — add to both list and map
    public void addEmployee(Employee emp) {
        Employee newEmp = new Employee(nextId++, emp.getName(), emp.getAge(), emp.getSalary(), emp.getDepartment());
        employeeList.add(newEmp);
        employeeMap.put(newEmp.getId(), newEmp);
    }

    // Remove employee by ID
    public void removeEmployee(int id) {
        Employee emp = employeeMap.remove(id);
        if (emp != null) {
            employeeList.remove(emp);
        }
    }

    // Search employee by ID (use HashMap)
    public Employee searchById(int id) {
        return employeeMap.get(id);
    }

    // Search employees by department
    public List<Employee> searchByDepartment(String department) {
        List<Employee> result = new ArrayList<>();

        result.stream().filter()
        for (Employee emp : employeeList) {
            if (emp.getDepartment().equals(department)) {
                result.add(emp);
            }
        }
        return result;
    }

    // Get all employees sorted by salary
    public List<Employee> getAllSortedBySalary() {
        employeeList.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        return employeeList;
    }

    // Print all employees
    public void printAll() {
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.printAll();
        manager.searchById(1);
        manager.searchByDepartment("Engineering");
        manager.removeEmployee(1);
        System.out.println(manager.getAllSortedBySalary());

        System.out.println("=== Employee Manager ===");
    }
}
