package HomeWork6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void ran(int length) {
        if (length <= 500) {
            System.out.println(this + " ����� " + length + " ������");
        } else {
            System.out.println(this + " �� �������� ��������� " + length + " ������");

        }

    }

    @Override

        public void swim (int length) {
            if (length <= 10) {
                System.out.println(this + " ����� " + length + " ������");
            } else {
                System.out.println(this + " �� �������� �������� " + length + " ������");

            }

        }

    @Override
    public String toString() {
        return "������ �� �����" + getName();
    }
}
