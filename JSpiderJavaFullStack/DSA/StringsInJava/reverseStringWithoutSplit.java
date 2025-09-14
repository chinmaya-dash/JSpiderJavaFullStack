package DSA.StringsInJava;

public class reverseStringWithoutSplit {
    public static void main(String[] args) {
        String s = " java is  easy    and  cozy  ";
        s = s.trim(); 

        String[] words = new String[s.length()]; 
        int wordi = 0;
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                str += ch; 
            } else {
                if (!str.isEmpty()) {
                    words[wordi++] = reverseWord(str);
                    str = "";
                }
            }
        }
        if (!str.isEmpty()) {
            words[wordi++] = reverseWord(str);
        }

        for (int i = 0; i < wordi; i++) {
            System.out.print(words[i] + " ");
        }
    }

    private static String reverseWord(String word) {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            rev += word.charAt(i);
        }
        return rev;
    }
}
