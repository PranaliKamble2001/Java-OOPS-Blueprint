package Inheritance;

/**
 * Concept: Single Inheritance (Business Logic Example)
 * Scenario: A Payroll System where a specialized FullTimeEmployee 
 * inherits core attributes from a base Employee class.
 */

// Superclass (Parent)
class Employee {
    protected int employeeId;
    protected String name;
    protected double baseSalary;

    public void displayBasicInfo() {
        System.out.println("ID: " + employeeId + " | Name: " + name);
    }
}

// Subclass (Child)
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(int id, String name, double salary, double bonus) {
        this.employeeId = id;
        this.name = name;
        this.baseSalary = salary;
        this.bonus = bonus;
    }

    public void calculateTotalCTC() {
        double total = baseSalary + bonus;
        System.out.println("Total Annual CTC: ₹" + total);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        // Creating a professional instance
        FullTimeEmployee emp = new FullTimeEmployee(101, "Pranali", 800000, 50000);

        System.out.println("--- Employee Payroll Record ---");
        emp.displayBasicInfo(); // Inherited method
        emp.calculateTotalCTC(); // Specialized method
    }
}
