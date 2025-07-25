import java.util.Scanner;
public class decToBin {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   
        int binary = 0;
        int pow = 1;
        while (num>0) {
            int bit = num%2;
            binary = (bit*pow)+binary;
            pow*=10;
            num/=2;
        }
        System.out.println(binary);
        sc.close();
    }
    
}
