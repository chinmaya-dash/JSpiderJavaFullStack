package MockFinal.CoreJavaFinalMock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Enter a number...");
        int n = sc.nextInt();
        int[] integerArray = new int[n];
        for (int i = 0; i < n; i++) {
            integerArray[i] = rd.nextInt(10);
        }
        for (int i : integerArray){
            System.out.println(i);
        }
        insertionSort(integerArray);
    }
    private static void insertionSort(int [] a){
        int n, i, j;
        for (i = 1; i < a.length - 1; i++) {
            n = a[i];
            for ( j = i-1; j >= 0; j--) {
                if (a[j] < n){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = n;
        }
        System.out.println(Arrays.toString(a));
    }

private static void bubbleSort(int [] a){
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length - 1 - i; j++) {
            if (a[j] > a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(a));
}

    private static int binarySearch(int n, int[] a, int start, int end){
    if (start > end)return -1;
    
    int mid = (start + end)/2;
    if (a[mid] == n)return a[mid];
    else if (n < a[mid])return binarySearch(n, a, start, mid-1);
    else return  binarySearch(n, a, mid+1, a.length-1);
    }
    
    private static int linearSearch(int n, int [] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n)return 1;
        }
        return -1;
    }
}
