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
            System.out.println("����� �������������");
        } else {
            System.out.println("����� �������������");
        }
    }
    public static void printColor() {
        int value = 99;
        if (value <=0) {
            System.out.println("�������");
        } else if (value >=100) {
            System.out.println("������");
        }
        else {
            System.out.println("Ƹ����");
        }
    }
    public static void compareNumbers(){
     int a = 9, b = 3;
        System.out.println(a >= b? "a >= b" : "a < b");

}
}


