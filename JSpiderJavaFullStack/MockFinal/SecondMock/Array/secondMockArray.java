package JSpiderJavaFullStack.MockFinal.SecondMock.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

    public class secondMockArray {
        public static void main(String[] args) {
            new Scanner(System.in);
            Random rd = new Random();
            int[] array = new int[10];

            for(int i = 0; i < array.length; ++i) {
                array[i] = rd.nextInt(20);
            }

            System.out.println(Arrays.toString(array));
            mergeSort(array);
            System.out.println(Arrays.toString(array));
        }

        private static void mergeSort(int[] a){
            if (a.length <= 1)return;

            int[] left  = new int[a.length/2];
            int[] right = new int[a.length-left.length];

            System.arraycopy(a, 0, left, 0, left.length);
            System.arraycopy(a, left.length, right, 0, right.length);
            mergeSort(left);
            mergeSort(right);

            merge(left, right, a);
        }

        private static void merge(int[] left, int[] right, int [] a){
            int i = 0, j = 0, k = 0;
            while (i<left.length && j < right.length){
                if (left[i] <= right[j]){
                    a[k++] = left[i++];
                }else{
                    a[k++] = right[j++];
                }
            }

            while (i < left.length){
                a[k++] = left[i++];
            }
            while (j < right.length){
                a[k++] = right[j++];
            }
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

            while(i <= j) {
                while(a[i] < pivot) {
                    ++i;
                }

                while(a[j] > pivot) {
                    --j;
                }

                if (i <= j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    ++i;
                    --j;
                }
            }

            return i;
        }

        private static void selectionSort(int[] a) {
            for(int i = 0; i < a.length - 1; ++i) {
                int si = i;

                for(int j = i + 1; j < a.length; ++j) {
                    if (a[j] < a[si]) {
                        si = j;
                    }
                }

                int temp = a[i];
                a[i] = a[si];
                a[si] = temp;
            }

        }

        private static void insertionSort(int[] a) {
            for(int i = 1; i < a.length; ++i) {
                int num = a[i];

                int j;
                for(j = i - 1; j >= 0 && a[j] > num; --j) {
                    a[j + 1] = a[j];
                }

                a[j + 1] = num;
            }

        }

        private static void bubbleSort(int[] a) {
            for(int j = 0; j < a.length; ++j) {
                for(int i = 0; i < a.length - 1 - j; ++i) {
                    if (a[i] < a[i + 1]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }

        }

        private static int binarySearch(int[] a, int key, int start, int end) {
            if (start > end) {
                return -1;
            } else {
                int mid = (start + end) / 2;
                if (a[mid] == key) {
                    return mid;
                } else {
                    return key > a[mid] ? binarySearch(a, key, mid + 1, end) : binarySearch(a, key, start, mid - 1);
                }
            }
        }

        private static int linearSearch(int[] a, int key) {
            for(int i = 0; i < a.length; ++i) {
                if (a[i] == key) {
                    return i;
                }
            }

            return -1;
        }
}
