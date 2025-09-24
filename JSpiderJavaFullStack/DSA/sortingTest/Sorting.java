package DSA.sortingTest;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[7];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
        // bubbleSort(a);
        selectionSort(a);

        System.out.println(Arrays.toString(a));
    }
static void selectionSort(int [] a){
    for (int i = 0; i < a.length - 1; i++) {
        int si = i; 
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] < a[si]) {
                si = j;  
            }
        }
        int temp = a[i];
        a[i] = a[si];
        a[si] = temp;
    }
}

    static void bubbleSort(int[] a) {
       for (int j = 0; j < a.length; j++) {
         for (int i = 0; i < a.length - 1 - j; i++) {
            if (a[i] >a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
       }
    }
}
