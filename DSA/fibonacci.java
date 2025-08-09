public class fibonacci {
    static int fib(int n){
        if (n == 0 || n ==1) 
            return n;
        
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 7;
        // int a =0;
        // int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));

        }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(a);
        //     int temp = a+b;
        //      a = b;
        //      b = temp;
        // }

    }
}
