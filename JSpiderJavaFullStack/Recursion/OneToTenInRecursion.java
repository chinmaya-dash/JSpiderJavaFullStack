package Recursion;
import java.util.Scanner;
public class OneToTenInRecursion {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = sc.nextInt();
        int sum = 0;
        number(1,5, sum);
        sc.close();
    }
    static void number(int n, int m, int sum){
            if (n == m+1) return;
        sum+=n;
        number(n+1, m, sum);
        System.out.println(sum);
    }


    }

