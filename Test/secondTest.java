package Test;

import java.util.Scanner;
public class secondTest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int n = sc.nextInt();
//        System.out.println("Enter a number : ");
//        int m = sc.nextInt();


//        for (int i = 1; i <= range ; i++) {
//            if (automerfic(i)){
//                System.out.println(i+" is a automerfic number");
//            }
////            else {
////                System.out.println(i+" is not a automerfic number");
////
////            }
//        }

//        System.out.println(decToBin(range));;
//        System.out.println(lcm(n,m));
//        System.out.println(gcd(n,m));

//        for (int i = 1; i <= range ; i++) {
//            if (neonNumber(i)){
//                System.out.println(i);
//            }
//        }
//        snakenumber(5);
    }
    static void pattern(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == i|| j == 0 || j == n|| i == 0 || i == n || j == n-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                        }
            System.out.println();
        }
    }
    static void alternetperfect(int n){
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)){
                if (c%2 == 0){
                    System.out.println(i+" is perfect");
                }
                c++;
            }
        }
    }
    static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n %i == 0){
                sum+=i;
            }
        }
        return sum == n;
    }
    static int lcm(int n, int m){
        return ((n*m)/gcd(n,m));
    }
static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b,a%b);//euclidian algorithm

}
    static void alternetPrimeNumber(int n){
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrimeOf(i)){
                if (c%2 == 0){
                    System.out.println(i);
                }
                c++;
            }
        }
    }
    static boolean isPrimeOf(int n){
        if (n <= 1 ) return false;
        if (n == 2) return true;
            for (int i = 3; i <= n/2; i++) {
                if (n%i == 0){
                    return false;
                }
            }

return true;
    }
    static boolean neonNumber(int n){
//        int num = n;
        int sum = 0;
        int prod = n*n;
        while (prod>0){
            int digit = prod%10;
            sum+=digit;
//            prod*=digit;
            prod/=10;
        }
        return sum == n;
    }
  static void   snakenumber1(int n){
      for (int i = 1; i <= n ; i++) {
          if (i%2==0){
              for (int j = i*n; j >= (i*n)-(n-1); j--) {
                  System.out.print(j+" ");
              }
              System.out.println();
          }else{
              for (int j = n*(i-1)+1; j <= i*n; j++) {
                  System.out.print(j+" ");
              }
              System.out.println();
          }
      }
    }
    static int decToBin(int n){
        int prod = 1;
        int sum = 0;
        while (n>0){
            int digit  = n%2;
            sum = digit*prod+sum;
            prod*=10;
            n/=2;
        }
        return sum;
    }
    static int binToDec(int n){
        int pow = 1;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum+=(digit*pow);
            pow*=2;
            n/=10;
        }
        return  sum;
    }
    static void numberPyramid(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void palindromnumberpyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i-1; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void halfhallowdiamondstar(int n){
//        upper
        for (int i = 1; i <= n ; i++) {
//            spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
//            stars
            for (int j = 1; j <= (i*2-1); j++) {
                if (j == i*2-1 || j == (i*2-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        lower
        for (int i = n-1; i >= 1; i--) {
//            spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
//            stars
            for (int j = 1; j <= (i*2-1); j++) {
                if (j == i*2-1|| j == (i*2-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void alternetfibonacci(int n){
        int c = 0;
        for (int i = 0; i < n; i++) {
//            if (i%2){
//                if (c%2==0){
//                    System.out.println(i);
//                }
//                c++;
//            }
            System.out.println(fibonacci(i));
        }
    }
    static int fibonacci(int n){
        if (n<=1) return n;
        else return fibonacci(n-2)+fibonacci(n-1);
    }
    static void alternetautomerfic(int n){
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (automerfic(i)){
                if (c%2 == 0){
                    System.out.println(i);
                }
                c++;
            }
        }
    }
    static void highestautomerfic(int n){
        for (int i = n; i >= 1 ; i--) {
            if (automerfic(i)){
                System.out.println(i);
                break;
            }
        }
    }
    static boolean automerfic(int n){
        int num = n;
        int prod = n*n;
        boolean bool = true;
        while (num > 0) {
            bool = num % 10 != prod % 10;
            num=num/10;
            prod/=10;
        }
        return bool;
    }
    static void alternetstrong(int n){
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (strong(i)){
                if (c%2 == 0){
                    System.out.println(i);
                }
                c++;
            }
        }
    }
    static boolean strong(int n){
        int num = n;
        int sum = 0;
        while (num>0){
            int digit = num%10;
            sum+=fact(digit);
            num/=10;
        }
        return sum == n;
    }
    static int fact(int n){
        if (n == 0 || n == 1)return 1;
        else return n*fact(n-1);
    }
    static void alternetarmstrong(int n){
        int c = 0;
        for (int i = 1; i <= n ; i++) {
            if (amstrong(i)){
                if (c%2 == 0){
                    System.out.println( i);
                }
                c++;
            }
        }
    }
    static boolean amstrong(int n){
        int num = n;
        int count = (int)Math.log10(n)+1;
        int sum = 0;
        while (num>0){
            int prod = 1;
            int digit  = num%10;
            for (int i = 1; i <= count; i++) {
                prod*=digit;
            }
            sum+=prod;
            num/=10;
        }
        return sum == n;
    }
    static void alternatePalindrom(int n){
        int c = 0;
        for (int i = 1; i <= n ; i++) {
            if (palindrom(i)){
                if (c%2 == 0){
                    System.out.println(i);
                }
                c++;
            }
        }
    }
    static boolean palindrom(int n){
        int num = n;
        int sum = 0;
        while (num>0){
            int digit  = num%10;
            sum = sum*10+digit;
            num/=10;
        }
        return sum == n;
    }
    static void hallawDiamond(int n){
//        Upper
        for (int i = 1; i <= n; i++) {
//            spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
//            stars
            for (int j = 1; j <= i*2-1; j++) {
                if (j == 1 || j == i*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //            lower
        for (int i = n-1; i >= 1; i--) {
//spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
//            stars
            for (int j = 1; j <= i*2-1 ; j++) {
                if (j == 1 || j == i*2-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void dsnakenumber(int n){
        for (int i = 0; i < n ; i++) {
           if (i%2 == 0){
               for (int j = 1; j <= n ; j++) {
                   System.out.print(i*n+j+" ");
               }
               System.out.println();
           }else{
               for (int j = n; j >= 1 ; j--) {
                   System.out.print(i*n+j+" ");
               }
               System.out.println();
           }
        }
    }

    static void p1To5Then10To6(int n) {
        for (int i = 1; i <= n; i++) {
            if(i%2 == 0){
                for (int j = i*n; j >= (i*n)-(n-1); j--) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }else{
                for (int j = n*(i-1)+1; j <= (n*(i-1))+n; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }


    static void J(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (j == 1){
                    for (int k = 1; k<= n;k++){
                        System.out.print(" ");
                    }
                }
                if (i == n){
                    System.out.print("");
                }
                if (i == 1 || j == n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void I(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if ( i == 1 || i == n || j == n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void H(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (j == 1 || i == n/2+1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void F(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (j == 1 || i == 1 || i == n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void E(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (j == 1 || i == 1 || i == n || i == n/2+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void D(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void C(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void B(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n || i == (n/2)+1 ){
//                if (i == n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void A(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                if (j == 1 || j == i*2-1 || i == (n/2)+2){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void diamond(int n){
//        Upper pyramid
        for (int i = 1; i <= n; i++) {
//            for spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
//            for stars and spaces
            for (int j = 1; j <= i*2-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        lowertriangle
        for (int i = n-1; i >= 1 ; i--) {
//            for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
//            for stars and spaces
            for (int j = i*2-1; j >= 1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
    static void hallowPyramid(int n){
        for (int i = 1; i <= n; i++) {
//            for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
//            for Stars
            for (int j = 1; j <= i*2-1 ; j++) {
                if (j == 1 || j == (i*2-1) || i == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
//                System.out.print("*");
            }
            System.out.println();
        }
    }



}
