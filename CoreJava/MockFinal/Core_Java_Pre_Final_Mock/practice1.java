package MockFinal.CoreJavaFinalMock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Enter a sentence...");
//        int n = 10;//sc.nextInt();
//
//        int[] integerArray = new int[n];
//        for (int i = 0; i < n; i++) {
//            integerArray[i] = rd.nextInt(10);
//        }
//        for (int i : integerArray){
//            System.out.println(i);
//        }
//        selectionSort(integerArray);
//        System.out.println(Arrays.toString(integerArray));

//        System.out.println(binarySearch(integerArray, 5, 0, integerArray.length - 1));
//        quickSort(integerArray, 0, integerArray.length - 1);
//        System.out.println(Arrays.toString(integerArray));

//        diamondPattern(n);

        String s = "i am a best java developer";
        duplicateChars(s);
    }

    private static void duplicateChars(String s){
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            
        }
    }

    private static void selectionSort(int [] a){
        for (int i = 0; i < a.length - 1; i++) {
            int n = a[i];
            for (int j = i+1; j < a.length; j++) {

            }
        }
    }

   private static void bubblesort(int [] a){
       for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a.length - 1 - i; j++) {
               if (a[j] > a[j+1]){
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
               }
           }
       }
   }

private static int binarySearch(int[] a, int key, int start, int end){
        if (start > end)return -1;

        int mid = (start+end)/2;

        if (a[mid] == key)return mid;
        else if (key > a[mid]) {
            return binarySearch(a, key, mid+1, end);
        }else return binarySearch(a, key, start, mid-1);
}

//
//    private static void diamondPattern(int n){
//
//        // TOP HALF
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//
//            int width = 2 * i + 1;
//            for (int j = 0; j < width; j++) {
//                if (j == 0 || j == width - 1) System.out.print("*");
//                else System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//
//        // BOTTOM HALF
//        for (int i = n - 2; i >= 0; i--) {
//
//            for (int j = 0; j < n - i; j++) {
//                System.out.print(" ");
//            }
//
//            int width = 2 * i + 1;
//            for (int j = 0; j < width; j++) {
//                if (j == 0 || j == width - 1) System.out.print("*");
//                else System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//    }
//
//    private static void quickSort(int[] a, int start, int end) {
//        if (start >= end) return;
//
//        int p = partition(a, start, end);
//
//        quickSort(a, start, p);
//        quickSort(a, p + 1, end);
//    }
//
//    private static int partition(int[] a, int start, int end) {
//        int pivot = a[(start + end) / 2];
//
//        int i = start - 1;
//        int j = end + 1;
//
//        while (true) {
//            do { i++; } while (a[i] < pivot);
//            do { j--; } while (a[j] > pivot);
//
//            if (i >= j)
//                return j;
//
//            int temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//        }
//    }
//
//
//
//    static void mergeSort(int[] a) {
//        if (a.length <= 1) {
//            return;
//        }
//        int[] left = new int[a.length / 2];
//        int[] right = new int[a.length - left.length];
//
//        for (int i = 0; i < left.length; i++) {
//            left[i] = a[i];
//        }
//
//        for (int j = 0; j < right.length; j++) {
//            right[j] = a[j + left.length];
//        }
//        mergeSort(left);
//        mergeSort(right);
//        merge(left, right, a);
//    }
//
//    public static void merge(int[] a, int[] b, int[] c) {
//        int i = 0, j = 0, k = 0;
//
//        while (i < a.length && j < b.length) {
//            if (a[i] < b[j]) {
//                c[k++] = a[i++];
//            } else {
//                c[k++] = b[j++];
//            }
//        }
//        while (i < a.length) {
//            c[k++] = a[i++];
//        }
//        while (j < b.length) {
//            c[k++] = b[j++];
//        }
//    }
//    private static void insertionSort(int [] a){
//        int n, i, j;
//        for (i = 1; i < a.length - 1; i++) {
//            n = a[i];
//            for ( j = i-1; j >= 0; j--) {
//                if (a[j] < n){
//                    a[j+1] = a[j];
//                }else{
//                    break;
//                }
//            }
//            a[j+1] = n;
//        }
//        System.out.println(Arrays.toString(a));
//    }
//
//private static void bubbleSort(int [] a){
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a.length - 1 - i; j++) {
//            if (a[j] > a[j+1]){
//                int temp = a[j];
//                a[j] = a[j+1];
//                a[j+1] = temp;
//            }
//        }
//    }
//    System.out.println(Arrays.toString(a));
//}
//
//    private static int binarySearch(int n, int[] a, int start, int end){
//    if (start > end)return -1;
//
//    int mid = (start + end)/2;
//    if (a[mid] == n)return a[mid];
//    else if (n < a[mid])return binarySearch(n, a, start, mid-1);
//    else return  binarySearch(n, a, mid+1, a.length-1);
//    }
//
//    private static int linearSearch(int n, int [] a){
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == n)return 1;
//        }
//        return -1;
//    }
}
