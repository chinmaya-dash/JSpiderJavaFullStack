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
        // selectionSort(a);
        // insertionSort(a);
        // mergeSort(a);
        quickSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

static void quickSort(int[] a, int start, int end) {
    if (start >= end) {
        return;
    }

    int i = start, j = end;
    int pivot = a[(start + end) / 2];

    while (i <= j) {
        while (a[i] < pivot) {
            i++;
        }
        while (a[j] > pivot) {
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

    if (start < j) {
        quickSort(a, start, j);
    }
    if (i < end) {
        quickSort(a, i, end);
    }
}


    static void mergeSort(int[] a) {
        if (a.length <= 1) {
            return;
        }

        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];

        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }

        for (int j = 0; j < right.length; j++) {
            right[j] = a[j + left.length];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, a);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

    static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = i - 1;
            int key = a[i];
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    static void selectionSort(int[] a) {
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
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
