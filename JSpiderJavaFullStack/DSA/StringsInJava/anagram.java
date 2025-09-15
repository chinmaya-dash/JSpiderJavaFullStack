package DSA.StringsInJava;

import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println();
        String n = sc.nextLine();

        checkIfAnagram(s, n);

        sc.close();
    }
    public static void checkIfAnagram(String s, String n){

        if (isAnagram(s, n)) {
            System.out.println("Yes it is a Anagram");
        } else {
            System.out.println("No, it is not a Anagram");
        }
    }

    public static boolean isAnagram(String s, String n) {
       while (true) {
         if (s.length() != n.length()) {
            return false;
        }
        else if (s.length() == 0 && n.length() == 0) {
            return true;
        }
        char ch = s.charAt(0);
        s = s.replaceAll(ch+"", "");
        n = n.replaceAll(ch+"", "");
       }
    }
}
