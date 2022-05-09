package HW3;

import java.util.Arrays;

public class HW3 {
    public static void main(String[] args) {
        inverseArray(new int[]{1,1,1,0,1,0,0});
        final int [][] ints = fillDArray (5);
        System.out.println(Arrays.deepToString(ints));
    }

    public static void inverseArray (int [] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (a[i] == 0 ? 1 : 0);
        }
    }
    public static int [] fillArray () {
        int [] a = new int[100];
        for (int i = 0; i < a.length; i++){
            a [i] = i + 1;
        }
        return a;
    }
    public static int [] changeArray () {
        int[] a = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < a.length; i++){
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        return a;
    }
    public static int [][] fillDArray (int n){
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][a.length - i - 1] = 1;
        }
        return a;
    }
    public static int[] retLenArr (int len, int initialValue){
        int [] a = new int[len];
        for (int i = 0; i < a.length; i++){
            a[i] = initialValue;
        }
        return a;
    }
    public static void min ( int [] a) {
        Arrays.sort(a);
        int min = a [0];
        int max = a [a.length-1];
        for (int i = 0; i < a.length; i++){
            if (a[i]<min){
                min = a[i];
            }
            if (a[i]>max) {
                max = a[i];
            }
        }
        System.out.println ("min =" + min);
        System.out.println ("max =" + max);


    }



}




