package HomeWork6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {
                new Cat(" ������"),
                new Dog(" ������"),
                new Cat(" ������"),
                new Dog(" �����"),
        };
        final Random random = new Random();
        for (Animal animal : animals) {
            animal.ran(random.nextInt(500));
            animal.swim(random.nextInt(50));
        }

    }
}
