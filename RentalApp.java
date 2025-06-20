abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) { return days * 1000.0; }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) { return days * 500.0; }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) { return days * 200.0; }
}

public class RentalApp {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println("Car Rent for 3 days: " + v.calculateRent(3));
    }
}
