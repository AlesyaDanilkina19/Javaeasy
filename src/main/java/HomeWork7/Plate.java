package HomeWork7;

public class Plate {
    private int food;
    public Plate (int food){
        this.food = food;
    }
    public boolean decreaseFood (int n) {
        if (food >= n){
        food -= n;
        return true;
        }
        System.out.println("��� ������������ !");
        return false;
    }

    public void addFood(int n) {
        if (n > 0) {
           food += n;
        } else {
            System.out.println("������: ���������� �������� ������������� ���������� ���!");
        }
    }

    @Override
    public String toString() {
        return "�������: " + food + " ���";
    }
}
