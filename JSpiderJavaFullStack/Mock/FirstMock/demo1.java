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
//         int n = sc.nextInt();
//         System.out.println(productOfDigits(n));
//         long num = sc.nextLong();
//         decimalToBinary(num);
//         int n = sc.nextInt();
//         checkIfAmstrong(1, n);
//         int start = sc.nextInt();
//         int range = sc.nextInt();
//         fibonacciInRange(0, 1, range);

//         int n = sc.nextInt();
//         triangleStarPattern1(n);

//         int n = sc.nextInt();
//         diamondPattern(n);
//         int n = sc.nextInt();
//         snakePattern(n);
//         int n = sc.nextInt();
//         alternateAmstrongNumber(0, n, 0);
//         int n = sc.nextInt();
//         alternateStrongNumber(1, n, 0 );
//         int n = sc.nextInt();
//         alternatePrimeNumber(2, n, 0);
//            int n = sc.nextInt();
//            alternatePalindrom(1, n, 0);
//         int n = sc.nextInt();
//         alternetSpyNumber(1,n,0);
//         int n = sc.nextInt();
//         alternetNeonNumber(1,n,0);
//         int n = sc.nextInt();
//         alternetPerfectNumber(1, n, 0);
//         int n = sc.nextInt();
//         pyramidInStar(n);
//         secondsnakePattern(5);
        alternateAutomerficNUmber(1, sc.nextInt(), 0);

                sc.close();
    }

    static void alternateAutomerficNUmber(int start, int end, int count) {
        if (start > end) return;
        if (isAutomerficNumber(start, start * start)) {
            if (count%2 == 0){
                System.out.println(start);
            }
            alternateAutomerficNUmber(start + 1, end, count + 1);
        }else{
            alternateAutomerficNUmber(start+1, end, count);
        }
    }
    static boolean isAutomerficNumber(int n, int m){
        if (n == 0)return true;
        if (n % 10 != m % 10) return false;

        return isAutomerficNumber(n/10, m/10);
    }

    static void secondsnakePattern(int n){
         for (int i = 0; i <= n; i++) {
             if (i%2 == 0){
                 for (int j = 1; j <= n; j++) {
                     System.out.print(i*n+j+"  ");
                }
             }else {
                 for (int j = n; j >= 1; j--) {
                     System.out.print(i*n+j+"  ");
                 }
             }
             System.out.println();
         }
     }
     static void suggestedBoxWithNumbers(int n){
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
                 int layer = Math.min(Math.min(i, j), Math.min(n - i + 1, n - j + 1));
                 System.out.print(layer + " ");
             }
             System.out.println();
         }
    }
     static void pyramidInStar(int n){
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n-i; j++) {
                 System.out.print("  ");
             }
             for (int j = 1; j <= i*2-1; j++) {
                    if (j == 1 || j == i*2-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
             }
             System.out.println();
         }
         for (int i = n-1; i >= 1 ; i--) {
             for (int j = n-i; j >= 1; j--) {
                 System.out.print("  ");
             }
             for (int j = i*2-1; j >= 1; j--) {
                 if (j == 1 || j == i*2-1){
                     System.out.print("* ");
                 }else{
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }
     }
     static void alternetPerfectNumber(int start, int end, int count){
         if (start>end)return;
         if (isPerfectNumber(start, start, 1, 0)){
             if (count%2 == 0){
                 System.out.println(start);
             }
             alternetPerfectNumber(start+1, end, count+1);
         }else{
             alternetPerfectNumber(start+1, end, count);
         }
     }
     static boolean isPerfectNumber(int n, int x, int divisor, int sum) {
            if (divisor>n/2)return x == sum;
         if (n % divisor == 0) {
             return isPerfectNumber(n, x, divisor+1, sum+divisor);
         }
         return isPerfectNumber(n, x, divisor+1, sum);
     }

    static void alternetNeonNumber(int start, int end, int count){
         if (start>end)return;
         if(isNeonNumber(start, start*start, 0)){
             if (count%2 == 0){
                 System.out.println(start);
             }
             alternetNeonNumber(start+1, end, count+1);
         }else{
             alternetNeonNumber(start+1, end, count);
         }
     }
     static boolean isNeonNumber(int n, int prod, int sum){
         if (prod == 0)return n == sum;
         return isNeonNumber(n, prod/10, sum+prod%10);
     }
     static void alternetSpyNumber(int start, int end, int count){
         if (start>end)return;
         if (isSpyNymber(start, 0, 1)){
             if (count%2 == 0){
                 System.out.println(start);
             }
             alternetSpyNumber(start+1, end, count+1);
         }else{
             alternetSpyNumber(start+1, end, count);
         }
     }
static boolean isSpyNymber(int n, int sum, int product){
         if (n == 0)return sum == product;
         return isSpyNymber(n/10, sum+n%10, product*(n%10));
}

     static void alternatePalindrom(int start, int end, int count){
         if (start>end)return;
         if (checkIfPalindrom(start, start, 0)){
             if (count%2 == 0){
                 System.out.println(start);
             }
             alternatePalindrom(start+1, end, count+1);
         }else{
             alternatePalindrom(start+1, end, count);

         }
     }
     static boolean checkIfPalindrom(int n, int x, int sum){
         if (n == 0)return x == sum;

         return checkIfPalindrom(n/10, x, sum*10+(n%10));
     }

     static void alternatePrimeNumber(int start, int end, int count){
         if (start>end)return;
         if (prime(start, 2)){
             if (count%2 == 0){
                 System.out.println(start);
             }
             alternatePrimeNumber(start+1, end, count+1);
         }else{
             alternatePrimeNumber(start+1, end, count);
         }
     }
     static boolean prime(int n, int i){
         if (i>n/2)return true;
         if (n%i == 0)return false;
         return prime(n, i+1);
     }

     static void alternateStrongNumber(int start, int end, int count){
         if (start>end)return;
         if (strong(start, start, 0)){
             if (count%2 == 0){
                 System.out.println(start);
             }
             alternateStrongNumber(start+1, end, count+1);
         }else{
             alternateStrongNumber(start+1, end, count);
         }
     }
     static boolean strong(int n, int x, int sum){
         if (n == 0)return x == sum;
         return  strong(n/10, x, sum+fact(n%10));
     }
     static int fact(int n){
         if (n == 0 || n == 1)return 1;
         return n*fact(n-1);
     }


     static void alternateAmstrongNumber(int start, int end, int count){
         if (start>end) return;
        int digit =  (start == 0)? 1 : (int)Math.log10(start)+1;
         if (amstrong(start, start, 0, digit)) {
             if (count % 2 == 0) {
                 System.out.println(start);
             }
             alternateAmstrongNumber(start+1, end, count+1);
         }else {
             alternateAmstrongNumber(start + 1, end, count);
         }
     }
     static boolean amstrong(int n, int x, int ams, int count){
         if (n == 0)return x == ams;

         return amstrong(n/10, x, ams+(int)Math.pow(n%10, count), count);
     }
     static void snakePattern(int n){
         for (int i = 0; i < n; i++) {
             if (i%2 == 0){
                 for (int j = 1; j <= n; j++) {
                     System.out.print(i*n+j+" ");
                 }
             }
             else {
                 for (int j = n; j >= 1 ; j--) {
                     System.out.print(i*n+j+" ");
                 }
             }
             System.out.println();
         }
     }
     static void diamondPattern(int n){
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n-i; j++) {
                 System.out.print("  ");
             }
             for (int j = 1; j <= i*2-1; j++) {
                 if (j == 1 || j == i*2-1)System.out.print("* ");
                 else System.out.print("  ");
             }
             System.out.println();
         }
         for (int i = n-1; i >= 1; i--) {
             for (int j = n-i; j >= 1; j--) {
                 System.out.print("  ");
             }
             for (int j = i*2-1; j >= 1 ; j--) {
                if (j == 1 || j == i*2-1)System.out.print("* ");
                else System.out.print("  ");
             }
             System.out.println();
         }
     }


     static void improvizedDiamondPattern(int n){
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n-i; j++) {
                 System.out.print("  ");
             }
             for (int j = 1; j <= n*i-1; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
         for (int i = n-1; i >= 1 ; i--) {
             for (int j = n-i; j >= 1; j--) {
                 System.out.print("  ");
             }
             for (int j = i*n-1; j >= 1 ; j--) {
                 System.out.print("* ");
             }
             System.out.println();
         }
     }


    static void  triangleStarPattern1(int n){
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n-i; j++) {
                 System.out.print("  ");
             }
             for (int j = 1; j <= i*2-1; j++) {
                 System.out.print("* ");
             }
             System.out.println();
         }
     }

     static void trianglePattern2(int n){
         int count = 1;
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print(count+" ");
                 count++;
             }
             System.out.println();
         }
     }
static void  trianglePattern1(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
        for (int j = i-1; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    }
}
    static void boxPattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n || i == j || i+j == n+1 || j == n/2+1 || i == n/2+1)

                {
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
}


     static void fibonacciInRange(int a, int b, int range) {
            if (range == 0)return;
         System.out.println(a+" ");
          fibonacciInRange(b, a+b, range-1);

     }



     static void checkIfAmstrong(int s, int n){
         if (s>n) return;
       if (isAmstrong(s, s, 0, (int)Math.log10(s)+1)){
           System.out.println("yes "+s+" is Amstrong");
       }
         checkIfAmstrong(s+1, n);
     }
     static boolean isAmstrong(int n, int arm, int sum, int count){
         if (n == 0)return sum == arm;
         return isAmstrong(n/10, arm, sum+(int)Math.pow(n%10, count), count);
     }

     static void decimalToBinary(long l){
         System.out.println(toBin(l));
     }
    static String toBin(long n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return toBin(n / 2) + (n % 2);
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
