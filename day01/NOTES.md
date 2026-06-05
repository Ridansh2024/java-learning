# Day 1 Notes

## Topics Covered
- [x] OOP - 4 Pillars
- [x] Class & Object
- [x] Inheritance
- [x] Polymorphism
- [x] LeetCode #1 Two Sum

## What I Learned

### OOP 4 Pillars
1. **Encapsulation** — private fields + public getters/setters (Employee class)
2. **Inheritance** — Manager extends Employee, reuses fields/methods
3. **Polymorphism** — Employee ref = new Manager(); calls Manager's overridden methods at runtime
4. **Abstraction** — hiding complexity, exposing only what's needed

### Class & Object
- **Class** = blueprint (Employee.java)
- **Object** = instance created with `new Employee("Alice", 30, 50000, "HR")`
- `this` refers to the current object
- Constructor initializes fields

### Inheritance
- `extends` keyword — child inherits parent's fields and methods
- `super(...)` calls parent constructor
- `@Override` to replace parent method behavior

### Polymorphism
- Parent reference can hold child object: `Employee ref = new Manager(...)`
- Method called depends on **actual object type**, not reference type
- `ref.calculateBonus()` calls Manager's version (20%), not Employee's (10%)

### Two Sum (LeetCode #1)
- **HashMap approach** — for each number, check if `target - num` exists in map
- Time: O(n), Space: O(n)
- Key insight: `a + b = target` means `b = target - a`

## Doubts / Questions
(Write here - ask Copilot tomorrow)

## English Practice
- [ ] Recorded 2-min explanation of "What is a class in Java?"
