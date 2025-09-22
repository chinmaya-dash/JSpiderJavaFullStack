package DSA.StringsInJava;

import java.util.Scanner;

public class stringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "java is easy";
        InItCap(s);
        InItCapInSplit(s);
        reverseStringUsingString(s);
        reverseStringUsingStringbuilder(s);
        reverseTheWordsInPlaceUsingSplit(s);
        reverseTheWordsInPlace(s);
        
        sc.close();
    }

    static void reverseTheWordsInPlace(String s) {
        String [] words = s.split(" ");
        String reverse = "";
        for (String word : words) {
            String str = "";
            for (int i = word.length()-1; i >= 0; i--) {
                str+=word.charAt(i);
            }
            reverse+=str+" ";
        }
        System.out.println(reverse);
    }

    static void reverseTheWordsInPlaceUsingSplit(String s) {
        String[] words = s.split(" ");
        String reverse = "";
        for (String word : words) {
            String str = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                str += word.charAt(i) + "";
            }
            reverse += str + " ";
        }
        System.out.println(reverse);
    }

    static void reverseStringUsingStringbuilder(String s) {
        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();
        System.out.println(reverse);
    }

    static void reverseStringUsingString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
    }

    static void InItCapInSplit(String s) {
        String[] words = s.split(" ");
        StringBuilder reesult = new StringBuilder();
        for (String word : words) {
            reesult.append(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
        }
        System.out.println(reesult);
    }

    static void InItCap(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i - 1] == ' ') {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
}
