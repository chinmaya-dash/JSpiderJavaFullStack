package MockFinal.SecondMock.Pattern;

import java.util.Scanner;

public class secondMockPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        diamondPattern(9);
    }
    private static void diamondPattern(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  "); // Leading spaces
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                if (j == 0 || j == 2 * i - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  "); // Leading spaces
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                if (j == 0 || j == 2 * i - 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
