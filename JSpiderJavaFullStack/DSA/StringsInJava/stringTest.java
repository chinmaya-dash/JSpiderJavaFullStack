package DSA.StringsInJava;

import java.util.Scanner;

public class stringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = " java java is is is very easy easy easy very ";
        s = s.trim();
        InItCap(s);
        // InItCapInSplit(s);
        // reverseStringUsingString(s);
        // reverseStringUsingStringbuilder(s);
        // reverseTheWordsInPlaceUsingSplit(s);
        // reverseTheWordsInPlace(s);
        countwords(s);
        removeDuplicateWordsOccurance(s);
        wordOccurance(s);
        sc.close();
    }

    static void wordOccurance(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length;i++) {
            if (words[i].equals("")) {
                continue;
            }
            int count = 1;
            for (int j = i+1; j<words.length;j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            System.out.println(words[i]+" - "+count);
        }
    }

    static void removeDuplicateWordsOccurance(String s) {
        String words[] = s.split(" ");
        String str = "";

        for (String word : words) {
            if (!str.contains(word)) {
                str += word + " ";
            }
        }
        System.out.println(str.trim());
    }

    static void countwords(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println(count);
    }

    static void reverseTheWordsInPlace(String s) {
        String[] words = s.split(" ");
        String reverse = "";
        for (String word : words) {
            String str = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                str += word.charAt(i);
            }
            reverse += str + " ";
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
