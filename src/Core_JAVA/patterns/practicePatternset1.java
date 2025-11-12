package patterns;

import java.util.Random;
import java.util.Scanner;

public class practicePatternset1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rf = new Random();

        long n = sc.nextInt();
        amStrongNumberUsingRecursion(0, n);
    }
    private static void amStrongNumberUsingRecursion(long start, long end){
        if (start > end)return;
        if (isAmstrong(start, start, 0)){
            System.out.println(start+" is a Amstrong number");
        }
       amStrongNumberUsingRecursion(start+1, end);
    }
    private static boolean isAmstrong(long n, long m, long sum){
        if (m == 0)return n == sum;
        int power = (int)Math.log10(n)+1;

        return isAmstrong(n, m/10, sum+(int)Math.pow(m%10, power));
    }
    private static void neonNumberUsingRecursion(long start, long end){
        if (start > end)return;
        if (isNeonNumber(start, start*start, 0)){
            System.out.println(start+" is a neon number");
        }
        neonNumberUsingRecursion(start+1, end);
    }
    private static boolean isNeonNumber(long n, long square, long sum){
        if (square == 0)return n == sum;
        return isNeonNumber(n, square/10, sum+square%10);
    }
    private static void neonNumberUsingLoop(long end){
        for (int i = 0; i < end; i++) {
            if (isNeon(i)){
                System.out.println(i+" is neon number");
            }
        }
    }
    private static boolean isNeon(long n){
        long square = n*n;
        long sum = 0;
        while (square != 0){
            long digit = square % 10;
            sum+=digit;
            square/=10;
        }
        return sum == n;
    }
    private static void primeInRangeUsingLoop(int n){
        for (int i = 0; i <= n; i++) {
          if (isPrimeLoop(i)){
              System.out.println(i+" is a prime number");
          }else{
              System.out.println(i+" is not a prime number");
          }
        }
    }
    private static boolean isPrimeLoop(int n){
        if (n <= 1)return false;
        for (int j = 2; j < n/2; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
    private static void primeInRangeUsingRecursion(int start, int end){
        if (start > end)return;
        if (isPrime(start, start/2)){
            System.out.println(start+" is a prime number");
        }else{
            System.out.println(start+" is not a prime number");
        }
        primeInRangeUsingRecursion(start+1, end);
    }
    private static boolean isPrime(int n, int start){
        if (n <= 1)return false;
        if (start == 1)return true;
        if (n % start == 0)return false;

        return isPrime(n, start - 1);
    }
}
