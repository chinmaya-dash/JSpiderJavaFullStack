package Core_JAVA.Java8.LambdaFunction.PredicateInterface;

import java.util.Scanner;
import java.util.function.Predicate;

public class test2 {
    public static void main(String[] args) {
        System.out.println("Enter a number...");
        int n = new Scanner(System.in).nextInt();
//        int [] s = new int[n];
//        for (int i = 0; i < n; i++) {
//            s[i] = new Scanner(System.in).nextInt();
//        }
        numberIsPerfectSquare(n);
    }
    private static void numberIsPerfectSquare(int n){
        Predicate<Integer> predicate = i -> (int)Math.sqrt(i)*(int)Math.sqrt(i) == i;
        if (predicate.test(n)) System.out.println(n+" It is a perfect square");
    }
    private static void StartWIthA(String[] s){
        Predicate<String> predicate = i -> i.charAt(0) == 'A';
        for (String string : s) {
            System.out.println(predicate.test(string) + " = " + string);
        }
    }
    private static void isEven(int n){
        Predicate<Integer> predicate = i -> {
            return i % 2 == 0;
        };
        for (int i = 0; i < n; i++) {
            if (predicate.test(i)){
                System.out.println(i+" is even number between : "+n);
            }
        }
    }
}
