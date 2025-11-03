package JSpiderJavaFullStack.MockFinal.SecondMock.String;

import java.util.Scanner;
import java.util.Stack;

public class SecondMockString2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String...");
        String s = sc.nextLine();

        norepeatingsubString(s);
    }

    private static void norepeatingsubString(String s) {
        String biggest = "";
        String smallest = s;

        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!str.contains(c + "")) {
                    str += c;
                } else {
                    break;
                }
            }

            if (!str.isEmpty()) {
                if (str.length() > biggest.length()) {
                    biggest = str;
                }
                if (str.length() > 1 || str.length() < smallest.length()) {
                    smallest = str;
                }
            }
        }

        System.out.println("Biggest non-repeating substring: " + biggest);
        System.out.println("Smallest non-repeating substring: " + smallest);
    }

    private static void biggestPalindromString(String s){
        String biggest = "";
        String smallest = s;

        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i+3; j < s.length(); j++) {
                str = s.substring(i, j);
                if (str.length() > 1 && isPalindrom(str, str.length()-1, "") && str.length() > biggest.length()){
                    biggest = str;
                }
                if (str.length() > 1 && isPalindrom(str, str.length()-1, "") && str.length() < smallest.length()){
                    smallest = str;
                }
            }
        }
        System.out.println("biggest palindrom is : "+biggest);
        System.out.println("Smallest palindrom is : "+smallest);
    }
    private static boolean isPalindrom(String s, int n, String rev){
        if (n < 0)return s .equals(rev);

        return isPalindrom(s, n-1, rev+s.charAt(n));
    }

private static void stringPermutation(String s, int start, int end){
        if (start == end){
            System.out.println(s);
            return;
        }
    for (int i = start; i <= end; i++) {
        String s1 = swap(s, start, i);
        stringPermutation(s1, start+1, end);
    }
}
private static String swap(String s, int i, int j){
        char [] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String (ch);
}

    private static void balancedString(String s){
        if (isBalanced(s)){
            System.out.println("Yes it is Balanced");
        }else{
            System.out.println("No it is not balanced");
        }
    }

    private static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }else if(ch == ']' || ch == '}' || ch == ')'){
                if (stack.isEmpty())return false;
                if (!match(stack.pop(), ch))return false;
            }
        }
        return stack.isEmpty();
    }
    public static boolean match(char ch1, char ch2){
        if (ch1 == '[' && ch2 == ']')return true;
        if (ch1 == '{' && ch2 == '}') return true;
        if (ch1 == '(' && ch2 == ')')return true;

        return false;
    }

    private static void uniqueCharacters(String s){
        s=s.trim();
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '\u0000')continue;
            int count = 0;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]){
                    count++;
                    ch[j] = '\u0000';
                }
            }
            if (count == 0) System.out.println(ch[i]);
        }
    }
    private static void removeDuplicateCharacters(String s){
        char[] ch = s.toCharArray();
        String res = "";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '\u0000')continue;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]){
                    ch[j] = '\u0000';
                }
            }
                res+=ch[i];
        }
        System.out.println(res);
    }
    private static void countWords(String s){
        s=s.trim();
       int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        System.out.println(count);
    }

    private static void reverseTheWordInStringInPlace(String s){
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                word.append(s.charAt(i));
            }else{
                if (!word.isEmpty()){
                    result.append(word.reverse()).append(" ");
                    word.setLength(0);
                }
            }
        }
        if (!word.isEmpty()){
            result.append(word.reverse()).append(" ");
        }
        System.out.println(result);
    }

    private static void reverseTheWordInString(String s){
        char [] ch = s.toCharArray();

        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = ch.length-1; i >= 0; i--) {
            if (ch[i] != ' '){
                word.append(ch[i]);
//                word.reverse();
            }else{
               if (!word.isEmpty()){
                   result.append(word).append(" ");
                   word.setLength(0);
               }
            }
        }
        if (!word.isEmpty()){
            result.append(word);
        }
        System.out.println(result);
    }

    private static void reverseTheWordInStringUsingSplit(String s){
        String [] words = s.split("\\s+");
        String result = "";
        for (String str : words) {
            for (int j = str.length() - 1; j >= 0; j--) {
                result += str.charAt(j);
            }
            result += " ";
        }
        System.out.println(result);
    }
    private static void inItCapNormal(String s){
        char [] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i - 1] == ' '){
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        System.out.println(ch);
    }

    private static void checkPalindrom(String s){
        if (isPalindromRecursion(s, s.length() - 1, "")){
            System.out.println("Yes It is Palindrom");
        }else{
            System.out.println("No it is not Palindrom");
        }
    }

    private static boolean isPalindromRecursion(String s, int n, String rev){

        if (n < 0) return s .equals(rev);

        return isPalindromRecursion(s, n-1, rev+s.charAt(n));
    }
}
