package HomeWork3;

public class HomeWork3 {
    public static void main(String[] args) {
        isPositive(-8);
        printTextNTimes("Hurry to pass all the exams!", 10);
    }


    public static boolean checkSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void isPositive(int a) {
        System.out.println(a >= 0? "Положительное" : "Отрицательное");
    }
    public static boolean isNegative(int a) {
        return a < 0;
    }
    public static void printTextNTimes (String text, int n){
        for (int i = 0; i < n; i++){
            System.out.println(text);
        }
    }
    public static boolean isLeapYear (int year){
    return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
    }

}


