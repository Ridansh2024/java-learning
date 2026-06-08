// Day 4: Java Streams API (Java 8+)

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String dept;
    double salary;

    Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary='"+salary+'\'' +
                '}';
    }
}
public class StreamsExercise {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Digambar", "Rahul", "Amit", "Priya", "Vijay", "Anita");

        System.out.println("=== Streams Practice ===");

        // TODO 1: Filter — get only even numbers
        // Hint: numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList())
        System.out.println("Even numbers: "+ numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));

        // TODO 2: Map — square each number
        // Hint: .map(n -> n * n)
        System.out.println("Squared: " + numbers.stream().map(n -> n * n).collect(Collectors.toList()));

        // TODO 3: Filter + Map — get even numbers then double them
        System.out.println("Even doubled: " + numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList()));

        // TODO 4: Reduce — sum of all numbers
        // Hint: .reduce(0, (a, b) -> a + b) OR .reduce(0, Integer::sum)
        System.out.println("Sum: " + numbers.stream().reduce(0 , (a ,b) -> a + b));
        System.out.println("Sum: " + numbers.stream().reduce(0 , Integer::sum));

        // TODO 5: Count — how many numbers > 5
        System.out.println("Count > 5: " + numbers.stream().filter(n -> n > 5).count());

        // TODO 6: Sort names alphabetically
        System.out.println("Sorted names: " + names.stream().sorted().collect(Collectors.toList()));

        // TODO 7: Filter names starting with 'A'
        System.out.println("Names starting with A: " + names.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList()));

        // TODO 8: Convert names to uppercase
        System.out.println("Uppercase: " + names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));

        // TODO 9: Find first name with length > 4
        System.out.println("First name with length > 4: " + names.stream().filter(name -> name.length() > 4).findFirst().orElse("Not Found"));

        // TODO 10: Join all names with comma
        // Hint: .collect(Collectors.joining(", "))
        System.out.println("Joined: " + names.stream().collect(Collectors.joining(", ")));

        System.out.println("\n=== Employee Stream Exercise ===");

        // TODO 11: Create a list of employees (name, dept, salary)
        List<Employee> employees = Arrays.asList(
                new Employee("Digambar", "IT", 40000.00),
                new Employee("Ridansh", "Test", 500000.00),
                new Employee("Sharvil", "Test", 100000.00),
                new Employee("Rahul", "IT", 600000.00),
                new Employee("Amit", "HR", 30000.00)
        );

//        Employee highest =
        System.out.println("Salary > 50000: " + employees.stream().filter(emp -> emp.salary > 50000).collect(Collectors.toList()));
        // - Filter employees with salary > 50000
        System.out.println("Group employee by department" + employees.stream().collect(Collectors.groupingBy(emp -> emp.dept)));
        // - Group employees by department
        System.out.println("Highest paid Employee: " + employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(emp -> emp.salary))));
        // - Find highest paid employee
        // - Calculate average salary
        System.out.println("average salary: " + employees.stream().mapToDouble(emp -> emp.salary).average().orElse(0));
    }
}
