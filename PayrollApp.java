class Employee {
    double calculateSalary() {
        return 30000.0;
    }
}

class Manager extends Employee {
    double calculateSalary() {
        return super.calculateSalary() + 10000.0; // bonus
    }
}

public class PayrollApp {
    public static void main(String[] args) {
        Employee emp = new Manager();
        System.out.println("Manager Salary: " + emp.calculateSalary());
    }
}
