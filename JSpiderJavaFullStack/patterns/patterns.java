package patterns;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    palindromnumberpyramid(n);
    }
static void pattern(int n){
    int st = 1;
    int sp = n/2;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= sp; j++) {
            
        }
        
    }
}
    
    static void palindromnumberpyramid(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // lower
         for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >= 1 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void alphabetlogic(int n){
 char c = 'A';
 int count = 1;
    for (char i = 1; i <= n; i++) {
        // for spaces
        for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (i*2-1); j++) {
            if (i ==  n || j == 1 || j == i*2-1) {
                System.out.print(c++);
            }else{
                System.out.print(count++);
            }
            
        }
        System.out.println();
        
    }
}

    




 static void hallowPyramid(int n){
        for (int i = n-1; i >= 1 ; i--) {
//            for spaces
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
//            for stars and spaces
            for (int j = i*2-1; j >= 1 ; j--) {
if (i == n-1  ) {
    
}            }
            System.out.println();
        }
    }

   
 static void halfhallowdiamondstar(int n){
//        upper

//        lower
        for (int i = n-1; i >= 1; i--) {
//            spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
//            stars
            for (int j = 1; j <= (i*2-1); j++) {
                if (i == 1 || j == i*2-1|| j == (i*2-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
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
}
