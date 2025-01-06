package PS001;

// Base class
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

// Derived class
class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id); // Calling the constructor of the base class
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails(); // Calling the base class method
        System.out.println("Department: " + department);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 1001, "HR");
        manager.displayDetails(); // Method from Employee class overridden in Manager class
    }
}
