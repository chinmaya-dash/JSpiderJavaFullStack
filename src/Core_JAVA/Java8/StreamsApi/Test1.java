package Core_JAVA.Java8.StreamsApi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {
    interface I{
        int getMeSquare(int n);
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i >= 10;
        Function<Integer, Integer> funtion = i -> i*i;
        Consumer<Integer> consumer = i -> {
            System.out.println(i);
            System.out.println(i*i);
            System.out.println(i*i*i);
        };
        Supplier<Integer> supplier = () -> {
            return (5*6*5);
        };
        for (int i = 5; i<= 12; i++){
            System.out.println(i+" predicate = "+predicate.test(i));
            System.out.println(i+" function = "+funtion.apply(i));
            consumer.accept(i);
            System.out.println("Supplier = " + supplier.get());
        }
    }
}
