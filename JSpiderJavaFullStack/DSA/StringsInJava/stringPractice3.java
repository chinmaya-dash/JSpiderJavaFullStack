package DSA.StringsInJava;

import java.util.Scanner;

public class stringPractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "He is a very very good boy, isn't he?";

        separateStringBasedOnSpecialchars(s);
        sc.close();
    }
    static void separateStringBasedOnSpecialchars(String s) {
        int count = 0;

        String[] words = s.split("[^a-zA-Z0-9]+");

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }
    }
}
