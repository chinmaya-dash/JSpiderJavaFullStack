package JSpiderJavaFullStack.DSA.Arrays;

import java.util.Random;
import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [] a = new int[n];

    initializeArray(a, a.length);
    arrayShow(a);
    smallestElement(a);
    sc.close();
    }

    private static void smallestElement(int [] a){
        int small = Integer.MAX_VALUE;
        for (int j : a) {
            if (j < small) {
                small = j;
            }
        }
        System.out.println("Smallest Elements is : "+small);
    }

    private static void biggestElement(int [] a){
        int max = 0;
        if (a.length <= 0) System.out.println("array is Empty");
        for (int j : a) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Biggest Element is : "+max);
    }

    private static void arrayShow(int [] a){
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void initializeArray(int[] a, int n){
        Random rd = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(n*2);
        }
    }

}
