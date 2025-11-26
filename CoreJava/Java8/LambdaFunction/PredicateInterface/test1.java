package Java8.LambdaFunction.PredicateInterface;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int [] a = new int[10];

        for (int i = 0;i<a.length;i++){
            a[i] = rd.nextInt(30);
        }

        Predicate1 predicate1 = i -> i >= 18;
        Predicate2 predicate2 = i -> i == 20;
        Predicate<Integer> predicate = (i) ->{
            return i % 5 == 0;
        };

        for (int n:a){
            if (predicate.test(n)){
                System.out.println(n+" -- "+n*n);
            }
        }
    }
}
