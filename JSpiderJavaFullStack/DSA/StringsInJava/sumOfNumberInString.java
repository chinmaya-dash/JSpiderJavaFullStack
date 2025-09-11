package DSA.StringsInJava;

import java.util.Scanner;

public class sumOfNumberInString {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       String str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '1' || ch <= '9') {
                sum+=Integer.parseInt(ch+"");
            }
        }
        System.out.println("sum of digits in a string is : "+sum);
        sc.close();
    }
}
