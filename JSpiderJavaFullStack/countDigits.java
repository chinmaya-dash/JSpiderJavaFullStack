// import java.util.Random;
import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Random rd = new Random(100);

        System.out.println("Enter a number (Recommended long type) : ");
        long num = sc.nextLong(); //rd.nextLong(1000000000);
        long count = 0;
        System.out.println(num);
        while (num != 0) {
            num = num / 10;
            System.out.println(num);
            count++;
        }
        sc.close();
        System.out.println("the number of digits that you have entered are : " + count);
    }
}
