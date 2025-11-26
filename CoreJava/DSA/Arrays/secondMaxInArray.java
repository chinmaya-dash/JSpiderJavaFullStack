package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class secondMaxInArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int [] a = {12,23,4,56,7,1,89,90};
    int key = 56;
    System.out.println(secondMaxElement(a));
    System.out.println(secondMinElement(a));
    System.out.println(linearSearch(a, key));
    Arrays.sort(a);
    System.out.println(binarySearch(a, key));
    System.out.println(binarySearchInRecursion(a, key, 0, a.length-1));
    sc.close();
}    

public static int binarySearchInRecursion(int[] a, int key, int start, int end){
    if (start > end)return -1;
    int mid = (start+end)/2;
    if (a[mid] == key) {
        return mid;
    }
    else if (key < a[mid]) {
        return binarySearchInRecursion(a, key, start, mid-1);
    }
    else{
        return binarySearchInRecursion(a, key, mid+1, end);
    }
}
public static int binarySearch(int [] a, int key){

    int start = 0;
    int end = a.length-1;

    while (start<=end) {
        int mid = (start+end)/2;
        if (a[mid] == key) {
            return mid;
        }else if (key<a[mid]) {
            end = mid-1;
        }else{
            start = mid+1;
        }
    }
    return -1;
}
public static int linearSearch(int [] a, int key){

    for (int i = 0; i < a.length; i++) {
        if (a[i] == key) {
            return i;
        }
    }
    return -1;
}
public static int secondMinElement(int [] a){
    int min1 = Integer.MAX_VALUE;
    int min2 = Integer.MAX_VALUE;


      for (int i = 0; i < a.length; i++) {
        if (a[i] < min1) {
            min2 = min1;
            min1 = a[i];
        }else if (a[i] < min2 && a[i] != min1) {
            min2 = a[i];
        }
    }
return min2;

}
public static int secondMaxElement(int[] a){
    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
        if (a[i] > max1) {
            max2 = max1;
            max1 = a[i];
        }else if (a[i] > max2 && a[i] != max1) {
            max2 = a[i];
        }
    }
return max2;
}
}
