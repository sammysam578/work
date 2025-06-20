abstract class MenuItem {
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    void prepare() { System.out.println("Preparing Appetizer..."); }
    void serve() { System.out.println("Serving Appetizer"); }
}

class MainCourse extends MenuItem {
    void prepare() { System.out.println("Cooking Main Course..."); }
    void serve() { System.out.println("Serving Main Course"); }
}

class Beverage extends MenuItem {
    void prepare() { System.out.println("Pouring Beverage..."); }
    void serve() { System.out.println("Serving Beverage"); }
}

public class ResturantApp {
    public static void main(String[] args) {
        MenuItem item = new MainCourse();
        item.prepare();
        item.serve();
    }
}
