class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return -1;
    }
}

public class GeometryApp {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        System.out.println("Circle Area: " + g.calculateArea(7));
        System.out.println("Rectangle Area: " + g.calculateArea(5, 6));
        System.out.println("Triangle Area: " + g.calculateArea(4, 3, true));
    }
}
