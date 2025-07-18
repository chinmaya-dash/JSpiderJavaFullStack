import java.util.*;

public class ArmstrongInRange {

    static void armstrong(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i;
            int count = (int) Math.log10(num) + 1; 
            int arm = 0;
            int temp = num;

            while (temp != 0) {
                int digit = temp % 10;
                int pow = 1;
                for (int j = 0; j < count; j++) {
                    pow *= digit;
                }
                arm += pow;
                temp /= 10;
            }

            if (arm == i) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range: ");
        int n = sc.nextInt();
        armstrong(n);
        sc.close();
    }
}
