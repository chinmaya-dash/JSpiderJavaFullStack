import java.util.Scanner;
public class binToDec {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter a  number");
long num = sc.nextLong();
long n = num;
// System.out.println(n);

int pow = 1;
long sum = 0;

while (n>0) {
    long digit = n%10;
    // System.out.println(digit);
    sum = sum+(digit*pow);
    // System.out.println(sum);
    pow*=2;
    // System.out.println(pow);
n/=10;
}
System.out.println(sum);

        sc.close();
}    
}
