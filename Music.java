abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Playing Piano sound...");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Strumming Guitar chords...");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Bow playing Violin...");
    }
}

public class Music {
    public static void main(String[] args) {
        Instrument i = new Guitar();
        i.playSound();
    }
}
