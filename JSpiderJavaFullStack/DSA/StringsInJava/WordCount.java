package DSA.StringsInJava;

public class WordCount {
    public static void main(String[] args) {
        String str = "java is easy";
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != ' ' && !inWord) {
                count++;        // new word starts
                inWord = true;
            } else if (c == ' ') {
                inWord = false; // end of a word
            }
        }

        System.out.println("Number of words: " + count);
    }
}

