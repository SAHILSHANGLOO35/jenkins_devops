import java.io.*;
import java.util.*;

class Employee {
    private String name;
    private double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }
    
    public void display() {
        System.out.println("Employee: " + name + ", Salary: $" + salary + ", Bonus: $" + calculateBonus());
    }
}

public class EmployeeBonus {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 50000),
            new Employee("Bob", 60000),
            new Employee("Charlie", 75000)
        };
        
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
