package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat (String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void eat (Plate p) {
      if (!satiety){
          satiety = p.decreaseFood(appetite);
      }
    }

    @Override
    public String toString() {
        return "Кот по имени " + name + ": " + (satiety ? "сытый" : "голодный");
    }
}
