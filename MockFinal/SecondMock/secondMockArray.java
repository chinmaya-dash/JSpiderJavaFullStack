package MockFinal.SecondMock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class secondMockArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(20);
        }
//        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
//        int key = sc.nextInt();

        quickSort(array, 0, array.length-1);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int piIndex = pivotIndex(a, start, end);
            quickSort(a, start, piIndex - 1);
            quickSort(a, piIndex + 1, end);
        }
    }

    private static int pivotIndex(int[] a, int start, int end) {
        int pivot = a[(start + end) / 2];
        int i = start;
        int j = end;

        while (i <= j) {
            while (a[i] < pivot) { // Move i to the right
                i++;
            }
            while (a[j] > pivot) { // Move j to the left
                j--;
            }

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }



    private static void selectionSort(int [] a){
        for (int i = 0; i < a.length-1; i++) {
            int si = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[si]){
                    si = j;
                }
            }
            int temp = a[i];
            a[i] = a[si];
            a[si] = temp;
        }
    }

    private static void insertionSort(int [] a){
        int i, j, num;

        for (i = 1; i < a.length; i++) {

            num = a[i];
            for (j = i-1; j >= 0; j--) {
                if (a[j] > num){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = num;
        }
    }

    private static void bubbleSort(int [] a){

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }

    private static int binarySearch(int[] a, int key, int start, int end){
        if (start > end)return -1;
        int mid = (start+end)/2;
        if (a[mid] == key) {
            return mid;
        } else if (key > a[mid]) {
            return binarySearch(a, key, mid+1, end);
        }else{
            return binarySearch(a, key, start, mid-1);
        }
    }
    private static int linearSearch(int[] a, int key){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)return i;
        }
        return -1;
    }
}
