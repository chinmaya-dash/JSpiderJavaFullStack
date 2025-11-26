package Core_JAVA.Java8.LambdaFunction.FunctionInterface;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class text2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer Array Length...");
        int [] s = new int[sc.nextInt()];
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter a number...");
            s[i] = sc.nextInt();
        }
        EvenOrOdd(s);
    }
    private static void EvenOrOdd(int[] a){
        Function<Integer, Boolean> function = i -> i%2 == 0;
        for (int j : a) {
            if (function.apply(j)) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
    private static void StringLengthCheck(String[] s){
        Function <String, Integer> function = String::length;
        Predicate<Integer> predicate = i -> i > 5;

        for (String string : s) {
            if (predicate.test(function.apply(string))) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
    private static void numberToCube(int[] a){
        Function<Integer, Integer> function = i-> i*i*i;

        for (int i = 0; i < a.length; i++) {
            System.out.println(function.apply(a[i]));
        }
    }
    private static void lengthOfString(String[] s){
        Function<String, Integer> function = String::length;
        for(String n : s){
            System.out.println(function.apply(n));
        }
    }
    private static void makeUpperCase(String[] s){
        Function<String, String> function = String::toUpperCase;

        for (String string : s) {
            System.out.println(function.apply(string));
        }
    }
}
