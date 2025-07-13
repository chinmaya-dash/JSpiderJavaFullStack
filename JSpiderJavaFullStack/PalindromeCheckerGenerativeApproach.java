import java.util.Scanner;

public class PalindromeCheckerGenerativeApproach {

    // Function to check if a single number is a palindrome (same as before)
    public static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return original == rev;
    }

    // 🔥 Optimized generator-based range palindrome printer
    public static void generatePalindromesUpToN(int n) {
        for (int i = 0; ; i++) {
            String left = String.valueOf(i);
            String right = new StringBuilder(left).reverse().toString();

            // even-length palindrome: left + right
            int evenPal = Integer.parseInt(left + right);
            // odd-length palindrome: left + reversed(right without first digit)
            int oddPal = Integer.parseInt(left + right.substring(1));

            if (evenPal > n && oddPal > n) {
                break;  // stop when both are beyond range
            }

            if (evenPal <= n) {
                System.out.println(evenPal + " is a palindrome");
            }

            if (oddPal <= n) {
                System.out.println(oddPal + " is a palindrome");
            }
        }
    }

    // Main menu and user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a number is a palindrome");
        System.out.println("2. Generate and print all palindromes up to a number");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                if (isPalindrome(num)) {
                    System.out.println(num + " is a palindrome number.");
                } else {
                    System.out.println(num + " is NOT a palindrome number.");
                }
                break;

            case 2:
                System.out.print("Enter the range (from 0 to n): ");
                int n = sc.nextInt();
                generatePalindromesUpToN(n);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        sc.close();
    }
}
