abstract class ManipulatableShape {
    abstract void resize(double factor);
    abstract void rotate(double angle);
}

class Square extends ManipulatableShape {
    public void resize(double factor) {
        System.out.println("Resizing Square by factor " + factor);
    }
    public void rotate(double angle) {
        System.out.println("Rotating Square by " + angle + " degrees");
    }
}

public class ManipulateApp {
    public static void main(String[] args) {
        ManipulatableShape shape = new Square();
        shape.resize(1.5);
        shape.rotate(90);
    }
}
