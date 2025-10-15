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
            quickSort(array, 0, array.length - 1);
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
