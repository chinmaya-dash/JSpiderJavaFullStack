package MockFinal.SecondMock.Array;

import java.util.Arrays;
import java.util.Random;

public class sortingAndSearching {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(20);
        }
//        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println();
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));

    }

    private static void quickSort(int[] a, int start, int end) {
        if (start >= end) return;

        int piIndex = pivotIndex(a, start, end);
        quickSort(a, start, piIndex - 1);
        quickSort(a, piIndex, end);
    }

    private static int pivotIndex(int[] a, int start, int end) {
        int pivot = a[(start + end) / 2];
        int i = start;
        int j = end;

        while (i <= j) {
            while (a[i] < pivot) i++;
            while (a[j] > pivot) j--;

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i; // partition index
    }


    private static void mergeSort(int [] a){
        if (a.length <= 1)return;


        int [] left = new int[a.length/2];
        int [] right = new int[a.length-left.length];
        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = a[i+left.length];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, a);
    }

    private static void merge(int []a, int [] b, int []c){
        int i = 0, j =0,  k = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        while (i < a.length){
            c[k++] = a[i++];
        }
        while (j < b.length){
            c[k++] = b[j++];
        }
    }

    private static void selectionSort(int [] a){
        for (int i = 0; i < a.length-1; i++) {
            int si = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] > a[si]){
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
            for ( j = i-1; j >=0 ; j--) {
                if (a[j] > num){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = num;
        }
    }

    private static void bubbleSort(int [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    private static int binarySearch(int [] a, int key, int start, int end){
        if (start > end )return -1;

        int mid = (start+end)/2;

        if (a[mid] == key)return mid;
        else if (mid < key)return binarySearch(a, key, mid+1, end);
        else return binarySearch(a, key, start, mid);

    }
    private static int  lenearSearch(int [] a, int key){
        for (int i = 0; i < a.length; i++) {
                if (a[i] == key){
                    return i;
                }
        }
            return -1;
    }
}
