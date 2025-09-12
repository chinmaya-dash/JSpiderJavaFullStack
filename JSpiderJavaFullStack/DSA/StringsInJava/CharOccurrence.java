package DSA.StringsInJava;

public class CharOccurrence {
    public static void main(String[] args) {
        String str = "ramana kumar";
        while (str.length() > 0) {
            char c = str.charAt(0);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            System.out.println(count);
            str = str.replace("" + c, ""); 
        }
    }
}
