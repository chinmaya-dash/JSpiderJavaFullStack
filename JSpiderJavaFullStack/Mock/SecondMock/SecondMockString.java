package Mock.SecondMock;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecondMockString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        removeDuplicateWordWithoutSplit(s);
    }
private static void removeDuplicateWordWithoutSplit(String s){
        String result = "";
        String word = "";
        Set<String> seen= new HashSet<String>();

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != ' '){
            word+=s.charAt(i);
        }else{
            if (!word.isEmpty()){
               if (!seen.contains(word))
                    result+=word+" ";
                    seen.add(word);
            }
            word = "";
        }
    }
    if (!word.isEmpty() && !seen.contains(word))result+=(word);
    System.out.println(result);
}

    private static void removeDuplicateWord(String s){
        String [] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!result.toString().contains(word)) {
                result.append(word).append(" ");
            }
        }
        System.out.println(result);
    }

    private static void removeDuplicatechar(String s){
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< s.length();i++) {
            char c = s.charAt(i);
            if (!sb.toString().contains(c+"")) {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
    private static void countwords(String s){
        char [] ch = s.toCharArray();
        int count = 1;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ' && ch[i+1] != ' '){
                count++;
            }
        }
        System.out.println(count);
    }
    private static void reverseWordsOfStringWithoutSplit(String s){
        StringBuilder result = new StringBuilder();
        StringBuilder words = new StringBuilder();
        int count = 0;

        for (int i = s.length()-1; i >= 0 ; i--) {

            if (s.charAt(i) != ' '){
                words.insert(0,s.charAt(i));
            }else if (!words.isEmpty()){
                result.append(words).append(" ");
                words.setLength(0);
                count ++;
            }
        }
        if (!words.isEmpty()) result.append(words);count++;
        System.out.println(result.toString());
        System.out.println( count);
    }
    private static void reverseWordsOfString(String s){
        s = s.trim();
        String [] words = s.split("\\s+");
        StringBuilder reverse = new StringBuilder();

        for (int i = words.length - 1; i >= 0 ; i--) {
            reverse.append(words[i]).append(" ");
        }
        System.out.println(reverse);
    }

    private static void inItCapNormal(String s){
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 || ch[i-1] == ' '){
                if (Character.isLetter(ch[i])){
                    ch[i] = Character.toUpperCase(ch[i]);
                    count++;
                }
            }else{
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        System.out.println(ch);
        System.out.println(count);
    }
    private static void smalltoCaptosmall(String s){
        char [] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i]-=32;
            } else if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i]+=32;
            }
        }
        System.out.println(ch);
    }
    private static void smalltoCaptosmallUsingMethode(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])){
                ch[i] = Character.toUpperCase(ch[i]);
            }else if (Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }
        System.out.println(ch);
    }
    private static void checkIfPalindrom(String s){
        if (isPalindromByStringBuilder(s)){
            System.out.println("Yes it is palindrom");
        }else{
            System.out.println("No it is not Palindrom");
        }
    }
    private static boolean isPalindromByStringBuilder(String s){
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(sb1).reverse();
        return sb1.toString().contentEquals(sb2.toString());
    }

}
