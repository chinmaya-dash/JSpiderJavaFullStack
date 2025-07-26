import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter a number : ");
        int num = sc.nextInt();

        square(num);
        upSideTriangle(num);
        downSideTriangle(num);


        sc.close();
    }
    
    static void square(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void upSideTriangle(int n){
for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void downSideTriangle(int n){
for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j+=2) {
                System.out.print(" ");
            }
            for (int j = n; j >=1; j-=2) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void leftSideTriangle(int n){

    }
    static void rightSideTriangle(int n){

    }
    
}
