package patterns;

import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {

    }
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
