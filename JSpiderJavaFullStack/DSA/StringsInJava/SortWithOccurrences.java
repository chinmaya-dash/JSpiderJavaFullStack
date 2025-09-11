package DSA.StringsInJava;

import java.util.Arrays;

public class SortWithOccurrences {
    public static void main(String[] args) {
        String str = "hello world";
        char[] arr = str.replace(" ", "").toCharArray();
        Arrays.sort(arr);

        String sorted = new String(arr);
        while (sorted.length() > 0) {
            char c = sorted.charAt(0);
            int count = 0;

            for (int i = 0; i < sorted.length(); i++) {
                if (sorted.charAt(i) == c) {
                    count++;
                }
            }

            System.out.print(c);
            if (count > 1) {
                System.out.print(count);
            }
            System.out.print(" ");
            sorted = sorted.replace("" + c, "");
        }
    }
}

