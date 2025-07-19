import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Range For Extracting Prime numbers Of : ");
        int range = sc.nextInt();

        for (int i = 2; i < range; i++) {
              if (primrof(i)) {
            System.out.println("Yes, " + i + " is a prime number");
        }
        }

      
        sc.close();
    }

    static boolean primrof(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
}
