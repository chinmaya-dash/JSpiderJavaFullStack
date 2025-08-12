package Recursion;
import java.util.Scanner;
public class OneToTenInRecursion {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
//        int s = n;
//        System.out.println(ispalindrom(n, n, 0));
range(10, 100);
        sc.close();
    }
public  static void range(int st, int end){
        if (st>end)return;
        if (ispalindrom(end)) System.out.println(end);
        return range(st , end-1);
}
    public static boolean ispalindrom(int n, int m, int sum){
        if (n == 0) return m == sum;
//        sum = (sum*10)+(n%10);
        return ispalindrom(n/10,m,(sum*10)+(n%10));
    }
//    public static boolean isspy(int n, int s, int p){
//        if (n == 0) return s == p;
//        sum+=s%10;
//        prod*=s%10;
//        return isNeon(n/10,s,p);
//    }
    public static boolean isNeon(int n, int s, int sum){
        if (s == 0) return n == sum;
        sum+=s%10;
            return isNeon(n,s/10,sum);
    }



    }

