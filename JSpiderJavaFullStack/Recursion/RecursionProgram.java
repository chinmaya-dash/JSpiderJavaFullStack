package Recursion;
import java.util.Scanner;

public class RecursionProgram {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and choose between these\n" +
                "1 - Palindrome\n" +
                "2 - Spy Number\n" +
                "3 - Neon Number\n" +
                "4 - Perfect Number");

        int choice = sc.nextInt();

        System.out.println("Enter start and end range:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        switch (choice) {
            case 1:
                palindromRange(start, end);
                break;

            case 2:
                spyRange(start, end);
                break;

            case 3:
                neonRange(start, end);
                break;

            case 4:
                perfectRange(start, end);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    // Palindrome
    public static void palindromRange(int st, int end) {
        if (st > end) return;
        if (isPalindrome(st)) System.out.println(st);
        palindromRange(st + 1, end);
    }

    public static boolean isPalindrome(int n) {
        return isPalindromeHelper(n, n, 0);
    }

    private static boolean isPalindromeHelper(int n, int m, int rev) {
        if (n == 0) return m == rev;
        return isPalindromeHelper(n / 10, m, rev * 10 + n % 10);
    }

    // Spy Number
    public static void spyRange(int st, int end) {
        if (st > end) return;
        if (isSpy(st)) System.out.println(st);
        spyRange(st + 1, end);
    }

    public static boolean isSpy(int n) {
        return isSpyHelper(n, 0, 1);
    }

    private static boolean isSpyHelper(int n, int sum, int prod) {
        if (n == 0) return sum == prod;
        return isSpyHelper(n / 10, sum + n % 10, prod * (n % 10));
    }

    // Neon Number
    public static void neonRange(int st, int end) {
        if (st > end) return;
        if (isNeon(st)) System.out.println(st);
        neonRange(st + 1, end);
    }

    public static boolean isNeon(int n) {
        return isNeonHelper(n, n * n, 0);
    }

    private static boolean isNeonHelper(int n, int sq, int sum) {
        if (sq == 0) return n == sum;
        return isNeonHelper(n, sq / 10, sum + sq % 10);
    }

    // Perfect Number
    public static void perfectRange(int st, int end) {
        if (st > end) return;
        if (isPerfect(st)) System.out.println(st);
        perfectRange(st + 1, end);
    }

    public static boolean isPerfect(int n) {
        return isPerfectHelper(n, 1, 0);
    }

    private static boolean isPerfectHelper(int n, int i, int sum) {
        if (i > n / 2) return n == sum;
        if (n % i == 0) sum += i;
        return isPerfectHelper(n, i + 1, sum);
    }
}
