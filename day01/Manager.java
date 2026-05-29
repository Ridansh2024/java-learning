// Day 1: Inheritance + Polymorphism

// TODO: Manager extends Employee
// Add: teamSize field
// Override: calculateBonus() to return 20% of salary
// Add: method getTeamInfo()

public class Manager extends Employee {

    // TODO: Complete this class
    private int teamSize;

    public Manager(String name, int age, double salary, String department, int teamSize) {
        // your code here - call super constructor
        super(name, age, salary, department);
        this.teamSize = teamSize;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }
    public int getTeamSize() {
        return teamSize;
    }

    public static void main(String[] args) {
        // TODO: Create Manager object
        // TODO: Demonstrate polymorphism - Employee ref = new Manager(...)
        Manager manager = new Manager("Alice", 35, 90000, "Engineering", 5);
        Employee employeeRef = manager; // Polymorphism: Employee reference to Manager object
        employeeRef.setSalary(10000);
        employeeRef.setDepartment("Engineering");
        System.out.println(employeeRef); // Calls Manager's toString() due to polymorphism
        System.out.println("Bonus: " + employeeRef.calculateBonus()); // Calls Manager's calculateBonus() due to polymorphism
        System.out.println("Salary: " + employeeRef.getSalary());
        System.out.println("Team Size: " + manager.getTeamSize());

    }
}
