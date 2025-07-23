import java.util.Scanner;

public class extra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n /= 10;
            // System.out.println(sum);

            if (n == 0 && sum > 9) {
                n = sum;
                sum = 0;

            }
        }
        System.out.println(sum);

        sc.close();
    }
}
