package ru.gb.danilkina;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
}
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign() {
        int a = 9, b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 99;
        if (value <=0) {
            System.out.println("Красный");
        } else if (value >=100) {
            System.out.println("Зелёный");
        }
        else {
            System.out.println("Жёлтый");
        }
    }
    public static void compareNumbers(){
     int a = 9, b = 3;
        System.out.println(a >= b? "a >= b" : "a < b");

}
}


