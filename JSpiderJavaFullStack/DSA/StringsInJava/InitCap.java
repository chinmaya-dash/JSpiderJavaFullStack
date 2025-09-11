package DSA.StringsInJava;

public class InitCap {
    public static void main(String[] args) {
        String str = "java is easy";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        System.out.println(result.trim());
    }
}
