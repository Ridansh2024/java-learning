// Day 4: Java Streams API (Java 8+)

import java.util.*;
import java.util.stream.*;

public class StreamsExercise {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = Arrays.asList("Digambar", "Rahul", "Amit", "Priya", "Vijay", "Anita");

        System.out.println("=== Streams Practice ===");

        // TODO 1: Filter — get only even numbers
        // Hint: numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList())
        System.out.println("Even numbers: ");

        // TODO 2: Map — square each number
        // Hint: .map(n -> n * n)
        System.out.println("Squared: ");

        // TODO 3: Filter + Map — get even numbers then double them
        System.out.println("Even doubled: ");

        // TODO 4: Reduce — sum of all numbers
        // Hint: .reduce(0, (a, b) -> a + b) OR .reduce(0, Integer::sum)
        System.out.println("Sum: ");

        // TODO 5: Count — how many numbers > 5
        System.out.println("Count > 5: ");

        // TODO 6: Sort names alphabetically
        System.out.println("Sorted names: ");

        // TODO 7: Filter names starting with 'A'
        System.out.println("Names starting with A: ");

        // TODO 8: Convert names to uppercase
        System.out.println("Uppercase: ");

        // TODO 9: Find first name with length > 4
        System.out.println("First name with length > 4: ");

        // TODO 10: Join all names with comma
        // Hint: .collect(Collectors.joining(", "))
        System.out.println("Joined: ");

        System.out.println("\n=== Employee Stream Exercise ===");

        // TODO 11: Create a list of employees (name, dept, salary)
        // - Filter employees with salary > 50000
        // - Group employees by department
        // - Find highest paid employee
        // - Calculate average salary
    }
}
