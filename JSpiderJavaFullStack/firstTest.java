import java.util.Scanner;
public class firstTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int  num = 1000;//sc.nextInt();

//        System.out.println(addAllTheDigits(num));
                perfectNumber(num);



    }
    static void gcd(int n, int m){
        for (int i = 1; i <= (n & m); i++) {

        }
    }
    static void perfectNumber(int n){
        for (int i = 1; i <= n; i++) {
            int temp = 0;
            for (int j = 1; j <= i/2 ; j++) {
                if (i%j == 0){
                    temp+=j;
                }
            }
            if (i == temp){
                System.out.println(i+" is a perfect number");
            }
        }
    }
    static void strongNumber(int n){
        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {

                int digit = num%10;
                sum+=factIteration(digit);
                num/=10;
            }
            if (i == sum){
                System.out.println(i+" is a stronng number");
            }
        }

    }
    static void spyNumbers(int n){

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;
            int product = 1;
            while (num>0){
                int digit = num%10;
                sum+=digit;
                product*=digit;
                num/=10;
            }
            if (sum == product){
                System.out.println(i);
            }
        }
    }
    static int addAllTheDigits(int n){
        while (n>9){
            int sum = 0;
            while (n>0){
                int digit = n%10;
                sum+=digit;
                n/=10;
            }
            n = sum;
        }
return n;
    }
    static int factIteration(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact*=i;
        }
        return fact;
    }
    static void numberSum(int n){
        int sum =0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
            if (i == n){
                System.out.print(i+" = "+sum);
            }
            else{
                System.out.print(i+" + ");
            }
        }
    }
    static void hallowDiamond(int n){
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars and spaces for hollow part
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Stars and spaces for hollow part
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    static void diamond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = i*2-1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        for (int i = 0; i < n; i++) {
            // Print numbers
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(j);
            }
            // Print characters
            for (int j = n - i - 1; j < n; j++) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }
    static  void p1(int n) {
        char m = 'Z';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if (i == j){
                    System.out.print(m);
                    m--;
                }else {
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }
    static void rightAngleNumber(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    static void rightAngleTriangleDown(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    

        static void rightAngleTriangleUp(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void squarePattern(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i == 1 || i == n || j == 1 || j == n|| i == n/2+1|| j == n/2+1|| j == i || j == (n+1)-i|| i == (n+1)-j){
                    System.out.print(" * ");

//                } else if () {

                } else{
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
    static void fibonacci(int n){
        int b = 1;
        int a = 0;
        for (int i = 0; i <n ; i++) {
            System.out.println(a);
            int next = a+b;
            a = b;
            b = next;
        }

    }
    static long decToBin(long n){
        long bin = 0;
        long pow = 1;
        while(n>0){
            long rem = n%2;
            bin +=rem*pow;
            n/=2;
            pow*=10;
        }
        return bin;
    }
    static int binToDec(int n){
        int dec = 0;
        int pow = 1;
        while(n>0){
            int digit = n%10;
            dec = digit*pow;
            pow=pow*2;
            n/=10;
        }
        return dec;
    }
    static boolean palindrome(int n){
        return n == reverseNumber(n);
    }
    static int reverseNumber(int n){
        int rev = 0;
        while(n>0){
            int digit  = n%10;
            rev = (rev*10) + digit;
            n/=10;
        }
        return  rev;
    }
    static boolean armstrong(int n){
        int temp = n;
        int temp2 = n;
        int arm = 0;

        int count = 0;//(int) Math.log10(n)+1
        while(temp2>0){
            int digit = temp2%10;
            count++;
            temp2/=10;
        }
        while(temp>0){
            int product = 1;
            int digit = temp%10;
            for (int i = 1; i <= count; i++) {
                product*=digit;
            }
            arm+=product;
            temp/=10;
        }

        return arm ==n;
    }
    static boolean strong(int n){
        int temp = n;
        int sum = 0;
        while(temp>0){
            int digit = temp%10;
            sum+=firstTest.fact(digit);
            temp/=10;
        }
        return sum == n;
    }
    static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
static int sumOfDigitsTillOneDigit1(int n){
        while(n>9){
            int sum = 0;
          while (n>0){
              int digit = n%10;
              sum+=digit;
              n/=10;
          }
          n = sum;
        }
        return n;
}
    static int sumOfDigitsTillOneDigit(int n){
        int sum = 0;
        int temp = n;
while (n>0){
            int digit = n%10;
            sum+=digit;
            n/=10;
    if (n == 0 && sum>9){
        n = sum;
        sum = 0;
    }
        }

        return sum;
    }

    static int negtiveToPositive(int n){
        return (-n);
    }

    static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int digits = n%10;
            sum+=digits;
            n/=10;
        }
        return sum;
    }

    static boolean perfect(int n){
        int sum = 0;
        for (int i = 1; i <=n/2 ; i++) {
            if (n%i == 0){
                sum+=i;
            }
        }
        return sum == n;
    }

    static boolean isPrime(int n){
        if (n<=1){
            return  false;
        } else if (n>2) {
            for (int i = 2; i < n/2; i++) {
                if (n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}