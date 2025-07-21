import java.util.Scanner;
public class curencycalcultion {
// 11:36 time 86 percent lapptop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your amount");
        int amount = sc.nextInt();

        if (amount<100) {
            System.out.println("Enter a valid amount(Multiples of hundreds)");
        }
        if (amount>=2000) {
            System.out.println((amount/2000)+" X 2000");
            amount = amount%2000;
            // System.out.println(amount);
        }
        if (amount>=500) {
            System.out.println((amount/500)+" X 500");
            amount%=500;
        }
        if (amount>=200) {
            System.out.println((amount/200)+" X 200");
            amount%=200;
        }
        if (amount>=100) {
            System.out.println((amount/100)+" X 100");
            amount%=100;
        }
        sc.close();
    }
}