package HomeWork6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void ran(int length) {
        if (length <= 200) {
            System.out.println(this + " ����� " + length + " ������");
        } else {
            System.out.println(this + " �� �������� ��������� " + length + " ������");

        }

    }

    @Override
    public void swim(int length) {
        System.out.println("��� �� ����� �������");

    }

    @Override
    public String toString() {
       return "��� �� �����" + getName();
    }
}
