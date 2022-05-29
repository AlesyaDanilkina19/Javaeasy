package HomeWork6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
                new Cat(" Барсик"),
                new Dog(" Байкал"),
                new Cat(" Багира"),
                new Dog(" Герда"),
        };
        final Random random = new Random();
        for (Animal animal : animals) {
            animal.ran(random.nextInt(500));
            animal.swim(random.nextInt(50));
        }

    }
}
