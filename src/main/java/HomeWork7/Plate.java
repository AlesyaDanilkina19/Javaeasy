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
        System.out.println("Еды недостаточно !");
        return false;
    }

    public void addFood(int n) {
        if (n > 0) {
           food += n;
        } else {
            System.out.println("Ошибка: невозможно добавить отрицательное количество еды!");
        }
    }

    @Override
    public String toString() {
        return "Тарелка: " + food + " еды";
    }
}
