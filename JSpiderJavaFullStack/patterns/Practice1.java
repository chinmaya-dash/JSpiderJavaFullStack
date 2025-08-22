package patterns;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("Enter a choice: ");
        Scanner sc = new Scanner(System.in);
        alphabetSnakePattern(sc.nextInt());
    }

    public static void alphabetSnakePattern(int n) {
        char c = 'A';

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(c++);
                }
            } else {
//                char start = (char)(c + n);
                char start = (char)(((i + 1) * n - 1) + 65);
                for (int j = 0; j < n; j++) {
                    System.out.print(start--);
                }
                c += n;
            }
            System.out.println();
        }
    }
}
