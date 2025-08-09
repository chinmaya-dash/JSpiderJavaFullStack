import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the digits i want the number of : ");
int num = sc.nextInt();
int som = sum(num);
System.out.println("Sum of the digits of "+num+": "+som);
sc.close();
    }

    static int sum(int num){
int sum = 0;
while (num!=0) {
    int digit = num%10;
sum+=digit;
    num/=10;
}       
return sum;
    }
}
