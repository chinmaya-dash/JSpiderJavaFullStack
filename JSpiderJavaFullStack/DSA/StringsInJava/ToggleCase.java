package DSA.StringsInJava;

public class ToggleCase {
    public static void main(String[] args) {
        String str = "Java Is Easy";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += c; // spaces and symbols unchanged
            }
        }

        System.out.println(result);
    }
}


