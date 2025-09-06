package Mock.FirstMock;

import java.util.Scanner;

public class demo1 {
     static void main() {
Scanner sc = new Scanner(System.in);
//long n = sc.nextLong();
//countTheDigits(n);
//         String s = sc.nextLine();
//         reverseString(s);
//int n = sc.nextInt();
//int m = sc.nextInt();
//         findGCDByEucledean(n,m);
//         int n = sc.nextInt();
//sumOfDigits(n);

//         int n = sc.nextInt();
//         int p = sc.nextInt();
//         System.out.println(powerOfNumber(n,p));
         int n = sc.nextInt();
         System.out.println(productOfDigits(n));

     }
     static int productOfDigits(int n){
         if (n == 0) return 0;
         return product(n);
     }
     static int product(int n){
         if (n == 0) return 1;
         return n%10 * product(n/10);
     }
     static  int  powerOfNumber(int num, int pow){
         if (pow == 0)return 1;
         return num * powerOfNumber(num, pow-1);

     }
     static  int  sumOfDigits(int n){
    if (n == 0)return 0;
    return sumOfDigits (n%10 + (n/10));
     }
//     static int sum(int n){
//         if (n == 0) return 0;
//         return sum(n/10, sum+n%10);
//     }


    static void findGCDByEucledean(int n, int m){
        System.out.println(GCDByEucledean(n, m));
    }

    private static int GCDByEucledean(int n, int m) {
    if (m == 0)return n;
    return GCDByEucledean(m, n%m);
     }

    static void findGCD(int n, int m){
        System.out.println(GCD(n, m, 1, 1));

    }
    static int GCD(int n,int m,int x, int y){
         if (x > Math.min(n, m))return y;
         if (n%x == 0 && m%x == 0  ) y = x;
         return GCD(n,m,x+1, y);
    }


    static void reverseString(String n){
        StringBuilder r = new StringBuilder();
        int l = n.length()-1;
        System.out.println("Reverse of the string is :");
        System.out.print(reversing(n, r, l, 0));
    }
    static String reversing(String n, StringBuilder s, int length, int count){
         if (length<count) return  s.toString();
        return reversing(n, s.append(n.charAt(length)), length-1, count);
    }


    static void countTheDigits(long n){
            System.out.println(countDigits(n, 0));
    }
    static int countDigits(long n, int count){
        if (n==0) return  count;
      return    countDigits(n/10, count+1);
    }
}
