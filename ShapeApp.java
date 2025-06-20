abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { this.length = l; this.width = w; }

    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { this.base = b; this.height = h; }

    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(7),
            new Rectangle(4, 5),
            new Triangle(6, 3)
        };

        for (Shape s : shapes) {
            System.out.println("Area: " + s.calculateArea());
        }
    }
}
