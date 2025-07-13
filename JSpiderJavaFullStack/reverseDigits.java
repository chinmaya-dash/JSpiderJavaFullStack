// import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Random rd = new Random(100);

        System.out.println("Enter a number (Recommended long type) : ");
        long num = 12345;// sc.nextLong(); //rd.nextLong(1000000000);
        // long count = 0;
        System.out.println(num);
        long temp = 0;
        // String temp = String.valueOf(num);
        // System.out.println(temp + " " + temp.getClass().getName());
        // StringBuilder rev = new StringBuilder(temp);
        // rev.reverse();
        // num = Long.valueOf(rev.toString());
        System.out.println(num / 10);
        while (num != 0) {
            temp = (temp * 10) + (num % 10);
            num /= 10;
            System.out.println(temp);

        }
    }
}
