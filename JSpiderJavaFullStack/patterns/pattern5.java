package patterns;

class pattern5 {

    public static void main(String[] args) {
        circle(9);
    }

    static void withoutHallow(int n) {
        for (int i = 1; i <= n; i++) {
            // for stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 2; j <= i * 2 - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void circle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == n/2+1 && i == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
            // for (int j = 1; j <= n; j++) {
            // if (j == i+1 || j == i-1) {
            // System.out.print(" ");
            // }
            // }
            
        }
    }
}