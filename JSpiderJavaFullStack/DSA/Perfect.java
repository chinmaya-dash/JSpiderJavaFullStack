import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Checking if " + num + " is a perfect number:");
        if (isPerfectNumber(num)) {
            System.out.println(num + " is a Perfect Number ");
        } else {
            System.out.println(num + " is NOT a Perfect Number ");
        }
        System.out.println("\nPerfect numbers in range 1 to " + num + ":");
        printPerfectNumbersInRange(num);
        sc.close();
    }

    static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    static void printPerfectNumbersInRange(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (isPerfectNumber(i)) {
                System.out.println(i + " is a Perfect Number");
            }
        }
    }
}
