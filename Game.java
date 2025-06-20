class Character {
    void attack() {
        System.out.println("Character performs a basic attack");
    }
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior slashes with a sword");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage casts a fireball");
    }
}

public class Game {
    public static void main(String[] args) {
        Character c = new Mage();
        c.attack();
    }
}
