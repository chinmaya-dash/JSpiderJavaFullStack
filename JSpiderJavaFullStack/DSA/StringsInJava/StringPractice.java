package DSA.StringsInJava;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "   @MADAMmalaYalamMADAM@   ";
        System.out.println();
        countchars(str);
        sc.close();
    }
    
    static void countchars(String s){
        int uc =0, lc = 0, sc = 0, nc = 0, spaces = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 'a' && s.charAt(i)<'z') {
                lc++;
            }
            else if (s.charAt(i) > 'A' && s.charAt(i)<'Z') {
                uc++;
            }
            else if (s.charAt(i) > '1' && s.charAt(i)<'9') {
                nc++;
            }
            else if (s.charAt(i) == ' ') {
                spaces++;
            }
            else{
                sc++;
            }
        }

        System.out.println("Upper case : " + uc+"\nLower case : " + lc +"\nspecial char : " + sc +"\nnumbers : " + nc +"\nSpaces : " + spaces);
    }
    static void toogleCase(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])) {
                ch[i] = Character.toUpperCase(ch[i]);
            }
            else if (Character.isUpperCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        // String n = ch.toString();
System.out.println(ch);
    }


    static void smallestPalindromeStringCheck(String s){
        String smallString = s;
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length()-1; j++) {
                str+=s.charAt(j);
              if (isPalindrome(str)) {
                  if (str.length()<smallString.length() && str.length()>1) {
                    smallString = str;
                }
              }
            }
        }
        System.out.println(smallString);
    }
    static void biggestPalindromeStringCheck (String s){
        String bigString = "";
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length()-1; j++) {
                str+=s.charAt(j);
                if (isPalindrome(str) && str.length()>1) {
                    if (str.length() > bigString.length()) {
                        bigString = str;
                    }
                    // System.out.println(str);
                }
            }
        }
        System.out.println(bigString);
    }
    static void palindromeStringCheck(String s) {
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {   
                str += s.charAt(j);
                if (isPalindrome(str) && str.length() > 1) { 
                    System.out.println(str);
                }
            }
        }
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {   
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
