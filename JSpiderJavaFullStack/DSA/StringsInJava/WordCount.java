package DSA.StringsInJava;

public class WordCount {
    public static void main(String[] args) {
        String str = "  java   is   ew  asy    ";
        int count = 1;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                count++;
            }
        }
        System.out.println("Number of words: " + count);
    }
}

