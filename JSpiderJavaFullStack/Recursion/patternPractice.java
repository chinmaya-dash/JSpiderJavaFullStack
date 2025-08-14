package Recursion;

import java.util.Scanner;

public class patternpractice {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
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
