package JSpiderJavaFullStack.MockFinal.SecondMock.String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecondMockString {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            minimumOccuredCharAndCount(s);
        }

        private static void minimumOccuredCharAndCount(String s) {
            char minChar = 0;
            int minCount = Integer.MAX_VALUE;

            for(int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                int count = 0;

                for(int j = 0; j < s.length(); ++j) {
                    if (s.charAt(j) == ch) {
                        ++count;
                    }
                }

                if (count < minCount) {
                    minCount = count;
                    minChar = ch;
                }
            }

            System.out.println(minChar + " - " + minCount);
        }

        private static void maximumOccuredCharAndCount(String s) {
            char maxChar = 0;
            int maxCount = 0;

            for(int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                int count = 0;

                for(int j = 0; j < s.length(); ++j) {
                    if (s.charAt(j) == ch) {
                        ++count;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    maxChar = ch;
                }
            }

            System.out.println(maxChar + " - " + maxCount);
        }

        public static void removeSpaces(String s) {
            StringBuilder result = new StringBuilder();
            StringBuilder word = new StringBuilder();

            for(int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) != ' ') {
                    word.append(s.charAt(i));
                } else if (!word.isEmpty()) {
                    result.append(word).append(" ");
                    word.setLength(0);
                }
            }

            if (!word.isEmpty()) {
                result.append(word);
            }

            System.out.println(result);
        }

        private static void countTheMatchingPairs(String s, String key) {
            int count = 0;

            for(int i = 0; i <= s.length() - key.length(); ++i) {
                if (s.substring(i, i + key.length()).equals(key)) {
                    ++count;
                }
            }

            System.out.println(count);
        }

        private static void consequtiveChar(String s) {
            char[] ch = s.toCharArray();
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < ch.length - 1; ++i) {
                if (ch[i] == ch[i + 1]) {
                    ch[i + 1] = '$';
                }

                sb.append(ch[i]);
            }

            sb.append(ch[ch.length - 1]);
            System.out.println(sb);
        }

        private static boolean panagram(String s) {
            String alphabets = "abcdefghijklmnopqrstuvwxyz";
            s = s.trim().toLowerCase();
            if (s.length() < 26) {
                return false;
            } else {
                for(int i = 0; i < alphabets.length(); ++i) {
                    char var10001 = alphabets.charAt(i);
                    if (!s.contains("" + var10001)) {
                        return false;
                    }
                }

                return true;
            }
        }

        private static boolean anagram(String s, String z) {
            if (s.length() != z.length()) {
                return false;
            } else if (s.isEmpty() && z.isEmpty()) {
                return true;
            } else {
                char ch = s.charAt(0);
                s = s.replace("" + ch, "");
                z = z.replace("" + ch, "");
                return anagram(s, z);
            }
        }

        private static void smallestPalindromString(String s) {
            String smallest = s;

            for(int i = 0; i < s.length(); ++i) {
                for(int j = i; j < s.length(); ++j) {
                    String str = s.substring(i, j + 1);
                    if (isPalindromByStringBuilder(str) && str.length() > 1 && str.length() < smallest.length()) {
                        smallest = str;
                    }
                }
            }

            System.out.println(smallest);
        }

        private static void biggestPalindromString(String s) {
            String biggest = "";

            for(int i = 0; i < s.length() - 1; ++i) {
                for(int j = i; j < s.length(); ++j) {
                    String str = s.substring(i, j + 1);
                    System.out.println(str);
                    if (isPalindromByStringBuilder(str) && str.length() > 1 && str.length() > biggest.length()) {
                        biggest = str;
                    }
                }
            }

            System.out.println(biggest);
        }

        private static void missingVowelsInString(String s) {
            String vowels = "AEIOUaeiou";
            String result = "";

            for(int i = 0; i < vowels.length(); ++i) {
                char var10001 = vowels.charAt(i);
                if (!s.contains("" + var10001)) {
                    result = result + vowels.charAt(i);
                }
            }

            System.out.println(result);
        }

        private static void wordOccuranceUsingSplit(String s) {
            String[] words = s.split("\\s+");

            for(int i = 0; i < words.length; ++i) {
                if (!words[i].equals("")) {
                    int count = 1;

                    for(int j = i + 1; j < words.length; ++j) {
                        if (words[i].equals(words[j])) {
                            ++count;
                            words[j] = "";
                        }
                    }

                    System.out.println(words[i] + " - " + count);
                }
            }

        }

        private static void charOccurance(String s) {
            while(!s.isEmpty()) {
                char ch = s.charAt(0);
                int count = 0;
                String n = "";

                for(int i = 0; i < s.length(); ++i) {
                    if (s.charAt(i) == ch) {
                        ++count;
                    } else {
                        n = n + s.charAt(i);
                    }
                }

                System.out.println(ch + " - " + count);
                s = n;
            }

        }

        private static void charOccuranceUsingReplace(String s) {
            String n;
            for(n = ""; !s.isEmpty(); s = n) {
                char ch = s.charAt(0);
                n = s.replace("" + ch, "");
                int count = s.length() - n.length();
                System.out.println(ch + " - " + count);
            }

        }

        private static void removeDuplicateWordWithoutSplit(String s) {
            String result = "";
            String word = "";
            Set<String> seen = new HashSet();

            for(int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) != ' ') {
                    word = word + s.charAt(i);
                } else {
                    if (!word.isEmpty()) {
                        if (!seen.contains(word)) {
                            result = result + word + " ";
                        }

                        seen.add(word);
                    }

                    word = "";
                }
            }

            if (!word.isEmpty() && !seen.contains(word)) {
                result = result + word;
            }

            System.out.println(result);
        }

        private static void removeDuplicateWord(String s) {
            String[] words = s.split("\\s+");
            StringBuilder result = new StringBuilder();

            for(String word : words) {
                if (!result.toString().contains(word)) {
                    result.append(word).append(" ");
                }
            }

            System.out.println(result);
        }

        private static void removeDuplicatechar(String s) {
            char[] ch = s.toCharArray();
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < s.length(); ++i) {
                char c = s.charAt(i);
                if (!sb.toString().contains("" + c)) {
                    sb.append(c);
                }
            }

            System.out.println(sb);
        }

        private static void countwords(String s) {
            char[] ch = s.toCharArray();
            int count = 1;

            for(int i = 0; i < ch.length; ++i) {
                if (ch[i] == ' ' && ch[i + 1] != ' ') {
                    ++count;
                }
            }

            System.out.println(count);
        }

        private static void reverseWordsOfStringWithoutSplit(String s) {
            StringBuilder result = new StringBuilder();
            StringBuilder words = new StringBuilder();
            int count = 0;

            for(int i = s.length() - 1; i >= 0; --i) {
                if (s.charAt(i) != ' ') {
                    words.insert(0, s.charAt(i));
                } else if (!words.isEmpty()) {
                    result.append(words).append(" ");
                    words.setLength(0);
                    ++count;
                }
            }

            if (!words.isEmpty()) {
                result.append(words);
            }

            ++count;
            System.out.println(result.toString());
            System.out.println(count);
        }

        private static void reverseWordsOfString(String s) {
            s = s.trim();
            String[] words = s.split("\\s+");
            StringBuilder reverse = new StringBuilder();

            for(int i = words.length - 1; i >= 0; --i) {
                reverse.append(words[i]).append(" ");
            }

            System.out.println(reverse);
        }

        private static void inItCapNormal(String s) {
            char[] ch = s.toCharArray();
            int count = 0;

            for(int i = 0; i < ch.length; ++i) {
                if (i != 0 && ch[i - 1] != ' ') {
                    ch[i] = Character.toLowerCase(ch[i]);
                } else if (Character.isLetter(ch[i])) {
                    ch[i] = Character.toUpperCase(ch[i]);
                    ++count;
                }
            }

            System.out.println(ch);
            System.out.println(count);
        }

        private static void smalltoCaptosmall(String s) {
            char[] ch = s.toCharArray();

            for(int i = 0; i < ch.length; ++i) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    ch[i] = (char)(ch[i] - 32);
                } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                    ch[i] = (char)(ch[i] + 32);
                }
            }

            System.out.println(ch);
        }

        private static void smalltoCaptosmallUsingMethode(String s) {
            char[] ch = s.toCharArray();

            for(int i = 0; i < ch.length; ++i) {
                if (Character.isLowerCase(ch[i])) {
                    ch[i] = Character.toUpperCase(ch[i]);
                } else if (Character.isUpperCase(ch[i])) {
                    ch[i] = Character.toLowerCase(ch[i]);
                }
            }

            System.out.println(ch);
        }

        private static void checkIfPalindrom(String s) {
            if (isPalindromByStringBuilder(s)) {
                System.out.println("Yes it is palindrom");
            } else {
                System.out.println("No it is not Palindrom");
            }

        }

        private static boolean isPalindromByStringBuilder(String s) {
            StringBuilder sb1 = new StringBuilder(s);
            StringBuilder sb2 = (new StringBuilder(sb1)).reverse();
            return sb1.toString().contentEquals(sb2.toString());
        }
    }


