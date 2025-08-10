
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want the factorial of ");
        int num = sc.nextInt();
        long fact = factorialof(num);
        // for (int i = 1; i <= num; i++) {
        // fact*=i;
        // }
        System.out.println("Factorial of " + num + " = " + fact);
        sc.close();
    }
                                        
    static long factorialof(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialof(n - 1);
        }
    }
}