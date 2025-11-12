package DSA.StringsInJava;

public class classAssignment {
    public static void main(String[] args) {
        // Test 1
        System.out.println("1. Consecutive to $: " + StringProblems.replaceConsecutiveWithDollar("bossss"));

        // Test 2
        System.out.println("2. Replace if vowels >=3: " + StringProblems.replaceIfVowelCountGE3("education"));

        // Test 3
        System.out.println("3. Matching pairs: " + StringProblems.countMatchingPairs("abcdababbaab", "ab"));

        // Test 4
        System.out.println("4. Smallest palindrome substring: " + StringProblems.smallestPalindromeSubstring("abcba"));

        // Test 5
        System.out.println("5. Remove extra spaces: '" + StringProblems.removeExtraSpaces("This    is   a    test   ") + "'");

        // Test 6
        String a = "KRISHNA";
        String b = "Radha";
        String[] swapped = StringProblems.swapStrings(a, b);
        System.out.println("6. Swapped Strings: a = " + swapped[0] + ", b = " + swapped[1]);
    }
}

class StringProblems {

    // 1. Change consecutive characters to a dollar ($)
    public static String replaceConsecutiveWithDollar(String input) {
        if (input.length() <= 1)
            return input;

        String result = "" + input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                result += "$";
            } else {
                result += input.charAt(i);
            }
        }
        return result;
    }

    // 2. Replace characters with '_' if vowel count >= 3
    public static String replaceIfVowelCountGE3(String input) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                vowelCount++;
            }
        }

        if (vowelCount >= 3) {
            String result = "";
            for (int i = 0; i < input.length(); i++) {
                result += "_";
            }
            return result;
        } else {
            return input;
        }
    }

    // 3. Count matching pairs of a key in the string
    public static int countMatchingPairs(String str, String key) {
        int count = 0;
        for (int i = 0; i <= str.length() - key.length(); i++) {
            String sub = str.substring(i, i + key.length());
            if (sub.equals(key)) {
                count++;
            }
        }
        return count;
    }

    // 4. Print smallest palindrome substring
    public static String smallestPalindromeSubstring(String input) {
        for (int len = 1; len <= input.length(); len++) {
            for (int i = 0; i <= input.length() - len; i++) {
                String sub = input.substring(i, i + len);
                if (isPalindrome(sub)) {
                    return sub;
                }
            }
        }
        return "";
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }

    // 5. Remove extra spaces
    public static String removeExtraSpaces(String input) {
        String result = "";
        boolean prevSpace = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                result += ch;
                prevSpace = false;
            } else {
                if (!prevSpace) {
                    result += ' ';
                    prevSpace = true;
                }
            }
        }
        return result.trim();
    }

    // 6. Swap two strings without third variable
    public static String[] swapStrings(String a, String b) {
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        return new String[] { a, b };
    }
}
