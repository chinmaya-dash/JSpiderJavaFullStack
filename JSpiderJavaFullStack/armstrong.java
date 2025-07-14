import java.util.Scanner;
public class armstrong {
    static void armstrongof(int num) {
        int n = num;
        int arm = 0;
        while (num != 0) {
            int digit = num % 10;
            arm = arm + (digit * digit * digit);
            num/=10;
        }
        if (n == arm) {
            System.out.println("Yes, It is a Armstrong Number");
        } else {
            System.out.println("No, It is not a Armstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        armstrongof(i);
        sc.close();
    }
}
