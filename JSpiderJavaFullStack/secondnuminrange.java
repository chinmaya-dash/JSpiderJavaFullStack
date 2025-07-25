import java.util.*;

public class secondnuminrange {
    static boolean isPrime(int n){
        if (n<=1) return false;       
            for (int i = 2; i < n/2; i++) {
                if (n%i == 0) return false;
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int range = sc.nextInt();
        int count = 0;
      for (int i = range; i >= 1; i--) {
        if (isPrime(i)) {
            System.out.println(i+"prime number");
            count++;
            if (count == 2) {
                System.out.println("seacond largest in range is "+i);
                break;
            }
        }//else
        // System.out.println(i+"Not prime");
      }
      sc.close();
    }
}
