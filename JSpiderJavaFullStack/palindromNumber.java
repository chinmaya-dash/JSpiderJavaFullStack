
// import java.util.Random;
import java.util.Scanner;

public class palindromNumber {
    public static void main(String[] args) {
        // Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a range within which you want to check all the palindromm numbers : ");
        System.out.println("It Should not be less than 0");
        int n = sc.nextInt();
        // int num =123;// sc.nextInt();
        int nonum;

        for (int i = 0; i <= n; i++) {
            int rev = 0;

            nonum = i;
            while (nonum != 0) {

                rev = (rev * 10) + (nonum % 10);
                nonum /= 10;
                // System.out.println(rev);

            }
            if (i == rev) {
                System.out.println(i + " is a palindrom number");

            }
        }

        sc.close();
    }}
    // for (int i = 0; i <= n; i++) {
    // if (isPalindrome(i)) {
    // System.out.println(i + " is a palindrome");
    // }
    // }

    // }
    // static boolean isPalindrome(int num) {
    // int rev = 0, original = num;
    // while (num != 0) {
    // rev = rev * 10 + num % 10;
    // num /= 10;
    // }
    // return original == rev;
    // }

// }
