// Day 4: Generics in Java

// TODO 1: Create a generic class Box<T> that can hold any type
class Box<T> {
    private T value;

    public Box(T value) {
        // TODO: set value
        this.value = value;
    }

    public T getValue() {
        // TODO: return value
        return value;
    }

    public void setValue(T value) {
        // TODO: set value
        this.value = value;
    }
}

// TODO 2: Create a generic class Pair<K, V> (key-value pair)
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        // TODO
        this.key = key;
        this.value = value;
    }

    public K getKey() { return this.key; }
    public V getValue() { return this.value; }

    @Override
    public String toString() {
        return this.key + " = " + this.value;
    }
}

// TODO 3: Generic method — works with any type
// Write a method that prints any array (Integer[], String[], Double[])

public class GenericsDemo {

    // TODO: Generic method
    public static <T> void printArray(T[] array) {
        // Loop and print each element
        for (T element : array) {
            System.out.println(element);
        }
    }

    // TODO 4: Bounded generics — only accepts Number types (Integer, Double, Float)
    public static <T extends Number> double sum(T[] numbers) {
        // TODO: Sum all numbers and return total
         double sum = 0;
        if(numbers != null && numbers.length > 0) {
            for (T element : numbers) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("=== Generics Demo ===");

        // TODO: Test Box<String>, Box<Integer>
         Box<String> nameBox = new Box<>("Digambar");
         Box<Integer> ageBox = new Box<>(24);

        // TODO: Test Pair
         Pair<String, Integer> student = new Pair<>("Digambar", 85);

        // TODO: Test printArray with different types
         Integer[] nums = {1, 2, 3, 4, 5};
         String[] names = {"A", "B", "C"};
         printArray(nums);
         printArray(names);

        // TODO: Test sum with bounded generics
         Integer[] numbers = {10, 20, 30};
         System.out.println("Sum: " + sum(numbers));
    }
}
