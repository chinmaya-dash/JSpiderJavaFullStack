package Recursion;
import java.util.Scanner;

public class RecursionProgram {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:\n" +
                "1 - Palindrome\n" +
                "2 - Spy Number\n" +
                "3 - Neon Number\n" +
                "4 - Perfect Number\n" +
                "5 - Strong Number\n" +
                "6 - Armstrong Number\n" +
                "7 - Prime Number\n" +
                "8 - Nth Prime Number\n" +
                "9 - Alternate Prime Numbers\n" +
                "10 - Decimal to Binary\n" +
                "11 - Binary to Decimal\n" +
                "12 - Automorphic Number\n" +
                "13 - Fibonacci Series");

        int choice = sc.nextInt();

        if (choice >= 1 && choice <= 9 || choice == 12) {
            System.out.println("Enter start and end range:");
            int start = sc.nextInt();
            int end = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    palindromeRange(start, end);
                }
                case 2 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    spyRange(start, end);
                }
                case 3 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    neonRange(start, end);
                }
                case 4 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    perfectRange(start, end);
                }
                case 5 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    strongRange(start, end);
                }
                case 6 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    armstrongRange(start, end);
                }
                case 7 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    primeRange(start, end);
                }
                case 8 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    System.out.println("Enter n for nth prime:");
                    int n = sc.nextInt();
                    nthPrimeHelper(start, end, n, 0);
                }
                case 9 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    alternatePrime(start, end);
                }
                case 10 -> {
                    System.out.println("Enter decimal number:");
                    int num = sc.nextInt();
                    System.out.println("Binary: " + decimalToBinary(num));
                }
                case 11 -> {
                    System.out.println("Enter binary number:");
                    int num = sc.nextInt();
                    System.out.println("Decimal: " + binaryToDecimal(num, 0));
                }
                case 12 -> {
                    System.out.println("Enter start and end range:");
                    int start = sc.nextInt();
                    int end = sc.nextInt();
                    automorphicRange(start, end);
                }
                case 13 -> {
                    System.out.println("Enter number of terms:");
                    int terms = sc.nextInt();
                    fibonacci(0, 1, terms);
                }
                default -> System.out.println("Invalid choice!");
            }

            // 1. Palindrome
    public static void palindromeRange(int st, int end) {
        if (st > end) return;
        if (isPalindrome(st)) System.out.println(st);
        palindromeRange(st + 1, end);
    }
    public static boolean isPalindrome(int n) {
        return palindromeHelper(n, n, 0);
    }
    private static boolean palindromeHelper(int n, int m, int rev) {
        if (n == 0) return m == rev;
        return palindromeHelper(n / 10, m, rev * 10 + n % 10);
    }

    // 2. Spy Number
    public static void spyRange(int st, int end) {
        if (st > end) return;
        if (isSpy(st)) System.out.println(st);
        spyRange(st + 1, end);
    }
    public static boolean isSpy(int n) {
        return spyHelper(n, 0, 1);
    }
    private static boolean spyHelper(int n, int sum, int prod) {
        if (n == 0) return sum == prod;
        return spyHelper(n / 10, sum + n % 10, prod * (n % 10));
    }

    // 3. Neon Number
    public static void neonRange(int st, int end) {
        if (st > end) return;
        if (isNeon(st)) System.out.println(st);
        neonRange(st + 1, end);
    }
    public static boolean isNeon(int n) {
        return neonHelper(n, n * n, 0);
    }
    private static boolean neonHelper(int n, int sq, int sum) {
        if (sq == 0) return n == sum;
        return neonHelper(n, sq / 10, sum + sq % 10);
    }

    // 4. Perfect Number
    public static void perfectRange(int st, int end) {
        if (st > end) return;
        if (isPerfect(st)) System.out.println(st);
        perfectRange(st + 1, end);
    }
    public static boolean isPerfect(int n) {
        return perfectHelper(n, 1, 0);
    }
    private static boolean perfectHelper(int n, int i, int sum) {
        if (i > n / 2) return n == sum;
        if (n % i == 0) sum += i;
        return perfectHelper(n, i + 1, sum);
    }

    // 5. Strong Number
    public static void strongRange(int st, int end) {
        if (st > end) return;
        if (isStrong(st)) System.out.println(st);
        strongRange(st + 1, end);
    }
    public static boolean isStrong(int n) {
        return strongHelper(n, n, 0);
    }
    private static boolean strongHelper(int n, int m, int sum) {
        if (n == 0) return m == sum;
        return strongHelper(n / 10, m, sum + fact(n % 10));
    }
    static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    // 6. Armstrong Number
    public static void armstrongRange(int st, int end) {
        if (st > end) return;
        if (isArmstrong(st)) System.out.println(st);
        armstrongRange(st + 1, end);
    }
    public static boolean isArmstrong(int n) {
        int len = (int) Math.log10(n) + 1;
        return armstrongHelper(n, n, 0, len);
    }
    private static boolean armstrongHelper(int n, int m, int sum, int len) {
        if (n == 0) return m == sum;
        return armstrongHelper(n / 10, m, sum + (int)Math.pow(n % 10, len), len);
    }

    // 7. Prime Numbers
    public static void primeRange(int st, int end) {
        if (st > end) return;
        if (isPrime(st, st / 2)) System.out.println(st);
        primeRange(st + 1, end);
    }
    public static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i == 1) return true;
        if (n % i == 0) return false;
        return isPrime(n, i - 1);
    }

    // 8. Nth Prime Number
    public static void nthPrime(int st, int end, Scanner sc) {
        System.out.println("Enter n for nth prime:");
        int n = sc.nextInt();
        nthPrimeHelper(st, end, n, 0);
    }
    public static void nthPrimeHelper(int st, int end, int n, int count) {
        if (st > end) return;
        if (isPrime(st, st / 2)) {
            count++;
            if (count == n) {
                System.out.println(st);
                return;
            }
        }
        nthPrimeHelper(st + 1, end, n, count);
    }

    // 9. Alternate Prime Numbers
    public static void alternatePrime(int st, int end) {
        alternatePrimeHelper(st, end, 0);
    }
    public static void alternatePrimeHelper(int st, int end, int toggle) {
        if (st > end) return;
        if (isPrime(st, st / 2)) {
            if (toggle % 2 == 0) System.out.println(st);
            toggle++;
        }
        alternatePrimeHelper(st + 1, end, toggle);
    }

    // 10. Decimal to Binary
    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        return decimalToBinaryHelper(n, "");
    }
    private static String decimalToBinaryHelper(int n, String res) {
        if (n == 0) return new StringBuilder(res).reverse().toString();
        return decimalToBinaryHelper(n / 2, res + (n % 2));
    }

    // 11. Binary to Decimal
    public static int binaryToDecimal(int n, int pow) {
        if (n == 0) return 0;
        return (n % 10) * (int)Math.pow(2, pow) + binaryToDecimal(n / 10, pow + 1);
    }

    // 12. Automorphic Number
    public static void automorphicRange(int st, int end) {
        if (st > end) return;
        if (isAutomorphic(st)) System.out.println(st);
        automorphicRange(st + 1, end);
    }
    public static boolean isAutomorphic(int n) {
        int sq = n * n;
        return endsWith(sq, n);
    }
    public static boolean endsWith(int num, int target) {
        if (target == 0) return true;
        if (num % 10 != target % 10) return false;
        return endsWith(num / 10, target / 10);
    }

    // 13. Fibonacci
    public static void fibonacci(int a, int b, int terms) {
        if (terms == 0) return;
        System.out.print(a + " ");
        fibonacci(b, a + b, terms - 1);
    }
}
