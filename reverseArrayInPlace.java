// import java.util.*;
// public class reverseArrayInPlace {
//     public static void main(String  [] args){
// Scanner sc = new Scanner(System.in);
// Random rd = new Random(100);

// System.out.print("Enter the size of tthe array : ");
// int n = sc.nextInt();

// int[] arr = new int[n];
// System.out.print("before reverse the array");
// for (int i = 0; i < n; i++) {
//     arr[i] = rd.nextInt(100);

//     System.out.print(arr[i]+" ");
// }
// int[] revArr = new int[n];
// System.out.print("After Revers the array ");
// for (int i = 0; i < revArr.length; i++) {
//     revArr[i] = arr[n-1-i];
//     System.out.print(revArr[i]+" ");
// }
// }
// }

import java.util.Random;
import java.util.Scanner;

public class reverseArrayInPlace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = rd.nextInt(10);
        System.out.println("enter the size of the array : " + n);

        System.out.println("Before reverse the array is : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]);
        }
        reverse(arr);
sc.close();
    }

    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
        System.out.println("After reverse the array : ");
        for (int i : arr) {
            System.out.println(i);
        }
        

    }
}