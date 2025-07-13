import java.util.Scanner;

public class PalindromeChecker {

    // Function to check if a single number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return original == rev;
    }

    // Function to check and print all palindrome numbers in a range
    public static void checkPalindromesInRange(int end) {
        for (int i = 0; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i + " is a palindrome number");
            }
        }
    }

    // Main function to allow user to choose
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a number is a palindrome");
        System.out.println("2. Check all palindrome numbers within a range");

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
                int range = sc.nextInt();
                checkPalindromesInRange(range);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        sc.close();
    }
}
