package HomeWork6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void ran(int length) {
        if (length <= 200) {
            System.out.println(this + " бежит " + length + " метров");
        } else {
            System.out.println(this + " не способен пробежать " + length + " метров");

        }

    }

    @Override
    public void swim(int length) {
        System.out.println(" от не умеет плавать");

    }

    @Override
    public String toString() {
       return " от по имени" + getName();
    }
}
