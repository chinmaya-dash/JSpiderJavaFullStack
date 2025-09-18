package Mock.FirstMock;

import java.util.Scanner;

public class firstMock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Recursion Practice ");
        String choice = "madam";

        if (palindromeString(choice, 0, choice.length() - 1)) {
            System.out.println(choice + " is a palindrome");
        } else {
            System.out.println(choice + " is not a palindrome");
        }
                sc.close();

    }
    static boolean palindromeString(String s, int start, int end) {
        if (start >= end) return true;

        if (s.charAt(start) != s.charAt(end)) return false;

        return palindromeString(s, start + 1, end - 1);
    }


    static  void fibonacciInRange(int n, int m){
        if (n>m)return;
        System.out.println(fibonacci(n));
        fibonacciInRange(n+1, m);
    }
    static int fibonacci(int n){
        if (n == 0 || n == 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static void factorial(int n, int m){
        if (n>m)return;
        System.out.println(fact(n));
factorial(n+1, m);
    }
    static int fact(int n){
        if (n == 0 || n == 1) return 1;
        return n* fact(n-1);
    }

    static void Nto1(int n, int m, int sum){
        if (n<m)return;
        System.out.println(n);
        Nto1(n-1, m, sum+n);
    }

    static void OnetoN(int m, int n) {
//        base case
        if (m > n) return;
        System.out.println(m);
        OnetoN(m + 1, n);
    }


//    static void rangeAmstrongInRecursion(int start, int end){
//        int count =(int) Math.log10(start)+1;
//        if (start>end)return;d
//        else if (amstrongInRange(start,start,count, 0)){
//            System.out.println(start);
//        }
//         rangeAmstrongInRecursion(start+1, end);
//    }

    static void rangeAmstrongInRecursion(int start, int end) {
        for (int i = start; i <= end; i++) {
            int count = (int) Math.log10(i) + 1;
            if (amstrongInRange(i, i, count, 0)) {
                System.out.println(i);
            }
        }
    }

    static boolean amstrongInRange(int n, int a, int count, int sum) {
        if (n == 0) return a == sum;

        return amstrongInRange(n / 10, a, count, sum + (int) Math.pow(n % 10, count));
    }


}
