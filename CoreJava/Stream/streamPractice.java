package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.*;

public class streamPractice {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = rd.nextInt(10);
        }



        List<Integer> integerList = Arrays.stream(array).boxed().toList();
        System.out.println(integerList);
        List<Integer> sec = integerList.stream().filter(i -> i%2 == 0).map(i -> i*10).toList();
        System.out.println(sec);

        Map <Integer, Long> repeatedINt =  integerList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(repeatedINt);

//        String s = "i am chinmaya dash";
//        char[] chars = s.toCharArray();
//        List<String> charList = stream(s.split("\\s+")).toList();
//
//        charList.forEach(System.out::println);
    }


}
