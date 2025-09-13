package DSA.StringsInJava;

public class stringPractice2 {
    public static void main(String[] args) {
        String a = "Chinmaya";
        String b = "Dash";
        StringSwap(a, b);

        String c = "Malayalam";
        biggestPalindromInString(c);
        smallestPalindromInString(c);    
    }
    private static void smallestPalindromInString(String c) {
        
 String smallestPalindrom = c;
        for (int i = 0; i < c.length(); i++) {
            
            for (int j = i+3 ; j < c.length(); j++) {
                String str = c.substring(i, j);
                if (isPalindrom(str)) {
                    System.out.println(str);
                    if (str.length()>smallestPalindrom.length()) {
                        smallestPalindrom=str;
                    }
                }
            }
            System.out.println(smallestPalindrom);
        }
    }
    private static void biggestPalindromInString(String c) {
        String biggestPalindrom = "";
        for (int i = 0; i < c.length(); i++) {
            
            for (int j = i+3 ; j < c.length(); j++) {
                String str = c.substring(i, j);
                if (isPalindrom(str)) {
                    System.out.println(str);
                    if (str.length()>biggestPalindrom.length()) {
                        biggestPalindrom=str;
                    }
                }
            }
            System.out.println(biggestPalindrom);

        }


    }
    public static boolean isPalindrom(String str) {
     int i = 0;
     int j = str.length()-1;
     while (i<j) {
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        i++;
        j--;

     }
     return true;
    }
    static void StringSwap(String a, String b){
                System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println(a);
        System.out.println(b);
    }
    
}
