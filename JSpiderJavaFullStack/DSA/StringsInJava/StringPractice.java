package DSA.StringsInJava;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "madam";
        if (palindromeStringCheck(str)) {
            System.out.println("Yes it is palindrom");
        }else{
            System.out.println("No ot is not Palindrom");
        }
        sc.close();
    }
    static boolean palindromeStringCheck(String s){
        char[] ch = s.toCharArray();
        for (int i = s.length()-1; i > 0; i--) {
        }
        
        return s.equals(ch);
    }
}
