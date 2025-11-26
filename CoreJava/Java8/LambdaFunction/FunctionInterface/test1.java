package Java8.LambdaFunction.FunctionInterface;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class test1 {
    public static void main(String[] args) {

        String [] m = {"chinmaya", "pramod", "lopa", "mama", "java developer"};

        Predicate<String> predicate = i -> i.length() > 5;
//        Function<String, Integer> function = i -> i.length();
//        Function<String, Integer> function = String::length;
//        Function1 function1 = i -> i.toUpperCase();
        Function1 function1 = String::toUpperCase;
        System.out.println(function1.apply("chinmaya dash"));
//        System.out.println(function.apply("Chinmaya dash"));

        for (String l : m){
            if (predicate.test(l)){
                System.out.println(function1.apply(l));
//                System.out.println(function.apply(l));
                System.out.println("Once done");
            }
        }
    }
}