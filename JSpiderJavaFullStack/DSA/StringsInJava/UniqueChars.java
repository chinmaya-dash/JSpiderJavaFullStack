package DSA.StringsInJava;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "programming";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.print(c + " ");
            }
        }
    }
}

