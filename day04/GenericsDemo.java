// Day 4: Generics in Java

// TODO 1: Create a generic class Box<T> that can hold any type
class Box<T> {
    private T value;

    public Box(T value) {
        // TODO: set value
    }

    public T getValue() {
        // TODO: return value
        return null;
    }

    public void setValue(T value) {
        // TODO: set value
    }
}

// TODO 2: Create a generic class Pair<K, V> (key-value pair)
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        // TODO
    }

    public K getKey() { return null; }
    public V getValue() { return null; }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}

// TODO 3: Generic method — works with any type
// Write a method that prints any array (Integer[], String[], Double[])

public class GenericsDemo {

    // TODO: Generic method
    public static <T> void printArray(T[] array) {
        // Loop and print each element
    }

    // TODO 4: Bounded generics — only accepts Number types (Integer, Double, Float)
    public static <T extends Number> double sum(T[] numbers) {
        // TODO: Sum all numbers and return total
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=== Generics Demo ===");

        // TODO: Test Box<String>, Box<Integer>
        // Box<String> nameBox = new Box<>("Digambar");
        // Box<Integer> ageBox = new Box<>(24);

        // TODO: Test Pair
        // Pair<String, Integer> student = new Pair<>("Digambar", 85);

        // TODO: Test printArray with different types
        // Integer[] nums = {1, 2, 3, 4, 5};
        // String[] names = {"A", "B", "C"};
        // printArray(nums);
        // printArray(names);

        // TODO: Test sum with bounded generics
        // Integer[] numbers = {10, 20, 30};
        // System.out.println("Sum: " + sum(numbers));
    }
}
