// Day 1: OOP Basics - Class, Object, Inheritance, Polymorphism

// TODO: Complete this class
public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;

    // TODO: Create constructor
    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // TODO: Create getters and setters
    private String getName() {
        return name;
    }
    private int getAge() {
        return age;
    }
    protected double getSalary() {
        return salary;
    }
    private String getDepartment() {
        return department;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                "department=" + department +"}";
    }
    // TODO: Override toString() method

    // TODO: Create a method calculateBonus() that returns 10% of salary
    public double calculateBonus() {
        return salary * 0.10;
    }

    public static void main(String[] args) {
        // TODO: Create 3 Employee objects and print their details
        Employee employee1 = new Employee("Alice", 30, 50000, "HR");
        Employee employee2 = new Employee("Bob", 25, 60000, "IT");
        Employee employee3 = new Employee("Charlie", 35, 70000, "Finance");
        employee1.calculateBonus();
        employee2.calculateBonus();
        employee3.calculateBonus();
        employee1.toString();
        employee2.toString();
        employee3.toString();
    }
}
