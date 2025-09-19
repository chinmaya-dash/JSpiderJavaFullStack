package DSA.StringsInJava;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "The quick brown fox jumps over the lazy dog";

        System.out.println(givenStringIsPanagram(str));
        sc.close();
    }

    public static boolean givenStringIsPanagram(String s) {
        if (s.length() < 26)return false;
        s = s.toLowerCase();
            
        for (char i = 'a'; i <= 'z'; i++) {
                if (!s.contains(i + ""))return false;
            }
        return true;
    }

    public static void missingVowelsInAStringUsingContains(String s) {
        String vowels = "AEIOUaeiou";
        String str = "";
        for (int i = 0; i < vowels.length(); i++) {
            if (!s.contains(vowels.charAt(i) + "")) {
                System.out.println();
                str += vowels.charAt(i);
            }
        }
        System.out.println(str);
    }

    static void checkIfDuplicateWithContains(String s) {
        s = s.toLowerCase().trim();
        String[] str = s.split(" ");

        String n = "";
        for (int i = 0; i < str.length; i++) {
            if (!n.contains(str[i] + "")) {
                n += str[i] + " ";
            }
        }
        inItCap(n);
    }

    public static void inItCap(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        System.out.println(result.trim());
    }

    // wajptp second max character count second min count in a given string
    static void secondMaxCharOccurance(String s) {
        String[] x = s.split(" ");
        String maxString = "";
        int maxCount = 0;
        String minString = "";
        int minCount = s.length();

        String secondMaxString = "";
        int secondMaxCount = 0;
        String secondMinString = "";
        int secondMinCount = s.length();

        for (int i = 0; i < x.length; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (x[i].equalsIgnoreCase(x[k])) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted)
                continue;

            int count = 0;
            for (int j = 0; j < x.length; j++) {
                if (x[i].equalsIgnoreCase(x[j])) {
                    count++;
                }
            }

            if (count > maxCount) {
                secondMaxCount = maxCount;
                secondMaxString = maxString;

                maxCount = count;
                maxString = x[i];
            } else if (count > secondMaxCount && count < maxCount) {
                secondMaxCount = count;
                secondMaxString = x[i];
            }

            if (count < minCount) {
                secondMinCount = minCount;
                secondMinString = minString;

                minCount = count;
                minString = x[i];
            } else if (count < secondMinCount && count > minCount) {
                secondMinCount = count;
                secondMinString = x[i];
            }
        }

        System.out.println("Max String: " + maxString + " = " + maxCount);
        System.out.println("Min String: " + minString + " = " + minCount);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Second Max String: " + secondMaxString + " = " + secondMaxCount);
        System.out.println("Second Min String: " + secondMinString + " = " + secondMinCount);
    }

    static void checkIfVowelPresent(String s) {
        String vowels = "AEIOUaeiou";
        String n = "";
        for (int i = 0; i < vowels.length(); i++) {
            if (!s.contains(vowels.charAt(i) + "")) {
                n += vowels.charAt(i);
            }
        }
        System.out.println(n);
    }

    static boolean ifPanagramString(String s) {
        if (s.length() < 26)
            return false;
        for (char i = 'a'; i < 'z'; i++) {
            if (!s.contains(i + ""))
                return false;
        }
        return true;

    }

    static void maxOccuranceInString(String s) {
        String n = "";
        char maxChar = ' ';
        int maxCount = 0;

        while (s.length() > 0) {
            char ch = s.charAt(0);
            n = s.replace(ch + "", "");
            int count = s.length() - n.length();
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
            System.out.println(ch + " = " + count);
            s = n;
        }
        System.out.println();
        System.out.println(maxChar + " = " + maxCount);
    }

    // wajptp second minimum char count in a given string
    static void isPalindromInRecursion(String s) {
        if (isRecursion(s, s.length() - 1, "")) {
            System.out.println("yes , it is palindrom");
        } else {
            System.out.println("No , it is not palindrom");
        }
    }

    static boolean isRecursion(String s, int n, String rev) {
        if (n < 0) {
            return s.equals(rev);
        }
        return isRecursion(s, n - 1, rev + s.charAt(n));
    }

    static void OccuranceInString(String s) {
        String n = "";
        char minChar = ' ';
        int minCount = s.length();

        while (s.length() > 0) {
            char ch = s.charAt(0);
            n = s.replace(ch + "", "");
            int count = s.length() - n.length();
            if (count < minCount) {
                minCount = count;
                minChar = ch;
            }
            System.out.println(ch + " = " + count);
            s = n;
        }

        System.out.println(minChar + " = " + minCount);
    }

    static void minOccuranceInString(String s) {
        String n = "";

        // char minChar = ' ';
        // int minCount = s.length();

        while (s.length() > 0) {
            char ch = s.charAt(0);
            n = s.replace(ch + "", "");
            int count = s.length() - n.length();
            // if (count < minCount) {
            // minCount = count;
            // minChar = ch;
            // }
            System.out.println(ch + " = " + count);
            s = n;
        }
        System.out.println();
        // System.out.println(minChar + " = " + minCount);
        System.out.println();
    }

    // Assignment

    // check givemn strins are anagram or not using recursion ******

    // write a java programs to given strings are anagram or not
    // "keep" = "peek" and "silent" = "listen"

    static boolean anagram(String s, String n) {
        if (s.length() != n.length()) {
            return false;
        }
        if (s.length() == 0 && n.length() == 0) {
            return true;
        }
        char ch = s.charAt(0);
        s = s.replace(ch + "", "");
        n = n.replace(ch + "", "");
        return anagram(s, n);
    }

    static void replacecharacterinString(String s) {
        System.out.println(s.replace("a", "@"));
        System.out.println(s);
    }

    static void countchars(String s) {
        int uc = 0, lc = 0, sc = 0, nc = 0, spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {
                lc++;
            } else if (s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
                uc++;
            } else if (s.charAt(i) > '1' && s.charAt(i) < '9') {
                nc++;
            } else if (s.charAt(i) == ' ') {
                spaces++;
            } else {
                sc++;
            }
        }

        System.out.println("Upper case : " + uc + "\nLower case : " + lc + "\nspecial char : " + sc + "\nnumbers : "
                + nc + "\nSpaces : " + spaces);
    }

    static void toogleCase(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])) {
                ch[i] = Character.toUpperCase(ch[i]);
            } else if (Character.isUpperCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        String n = ch.toString();
        System.out.println(n);
    }

    static void smallestPalindromeStringCheck(String s) {
        String smallString = s;
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length() - 1; j++) {
                str += s.charAt(j);
                if (isPalindrome(str)) {
                    if (str.length() < smallString.length() && str.length() > 1) {
                        smallString = str;
                    }
                }
            }
        }
        System.out.println(smallString);
    }

    static void biggestPalindromeStringCheck(String s) {
        String bigString = "";
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length() - 1; j++) {
                str += s.charAt(j);
                if (isPalindrome(str) && str.length() > 1) {
                    if (str.length() > bigString.length()) {
                        bigString = str;
                    }
                    // System.out.println(str);
                }
            }
        }
        System.out.println(bigString);
    }

    static void palindromeStringCheck(String s) {
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                str += s.charAt(j);
                if (isPalindrome(str) && str.length() > 1) {
                    System.out.println(str);
                }
            }
        }
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
