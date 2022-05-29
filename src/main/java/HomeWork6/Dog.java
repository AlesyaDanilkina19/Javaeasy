package HomeWork6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void ran(int length) {
        if (length <= 500) {
            System.out.println(this + " бежит " + length + " метров");
        } else {
            System.out.println(this + " не способен пробежать " + length + " метров");

        }

    }

    @Override

        public void swim (int length) {
            if (length <= 10) {
                System.out.println(this + " плывЄт " + length + " метров");
            } else {
                System.out.println(this + " не способен проплыть " + length + " метров");

            }

        }

    @Override
    public String toString() {
        return "—обака по имени" + getName();
    }
}
