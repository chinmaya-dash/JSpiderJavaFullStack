import java.util.Scanner;
public class armstrong {
    static void armstrongof(int num) {
        int n = num;
        int count =(int) Math.log10(num)+1;
        int arm = 0;
        int digit;
//        System.out.println(count);

        while(num!=0){
             digit = num%10;
             int pow =1;
            for (int i = 0; i < count; i++) {
            pow*=digit;
                System.out.println(pow);
            }
            arm+=pow;
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