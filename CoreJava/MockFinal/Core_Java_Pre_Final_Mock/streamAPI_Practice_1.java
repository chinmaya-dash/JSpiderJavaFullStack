package MockFinal.Core_Java_Pre_Final_Mock;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI_Practice_1 {
    public static void main(String[] args) {

        String str = "I love Java";
//        String [] arr = str.split("s\\+");
//          String [] arr = {"chinu", "pramod", "arundhati", "aryan", "amul", "art"};
//          WordToUpperCase(arr);

//        int[] arr = {12, 23, 13, 14, 15, 16, 17, 19, 20, 25};
//        squareEvenSort(arr);

        int[] arr = {12, 23, 13, 14, 15, 16, 17, 19, 20, 25, 15, 25, 12};
        removeDuplicateNumbers(arr);
    }
    private static void removeDuplicateNumbers(int [] arr){
        List<Integer> result = Arrays.stream(arr)
                .distinct()
                .sorted()
                .boxed()
                .toList();
        result.forEach(System.out::println);
    }

    private static void squareEvenSort(int [] arr){
        List<Integer> result = Arrays.stream(arr)
                .map(i -> i*i)
                .filter(i -> i % 2 == 0)
                .sorted()
                .boxed()
                .toList();
        result.forEach(System.out::println);
    }

    private static void WordToUpperCase(String [] arr){
      List<String> list = Arrays.asList(arr);
      List<String> result = list.stream()
                .filter(i -> i.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
    }
}
