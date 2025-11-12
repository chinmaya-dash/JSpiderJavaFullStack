package Java8.StreamsApi;

import java.util.*;
import java.util.stream.*;

public class Test {

    // -------------------- Employee Class --------------------
    static class Emp {
        String name;
        char gender;

        public Emp(String name, char gender) {
            this.name = name;
            this.gender = gender;
        }

        public static Emp[] createArray() {
            return new Emp[]{
                    new Emp("Chinmaya", 'm'),
                    new Emp("Laxman", 'm'),
                    new Emp("Ram", 'm'),
                    new Emp("Chinmayee", 'f'),
                    new Emp("Lopa", 'f'),
                    new Emp("Iti", 'f')
            };
        }
    }

    // -------------------- Utility Method --------------------
    public static int[] getArray() {
        int[] a = new int[15];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(10);
        }
        return a;
    }

    // -------------------- Main --------------------
    public static void main(String[] args) {

        // Count male and female employees
        Emp[] employees = Emp.createArray();
        List<Emp> empList = Arrays.asList(employees);

        long maleCount = empList.stream().filter(e -> e.gender == 'm').count();
        long femaleCount = employees.length - maleCount;

        System.out.println("Male count : " + maleCount + " | Female count : " + femaleCount);
        System.out.println("\n Strings starting with 'A' converted to uppercase");

        // Strings starting with 'A' -> uppercase
        List<String> names = Arrays.asList("Chinmaya", "Arundhati", "Pramod", "Lopamudra");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("\n Even numbers squared and sorted");

        //  Even numbers -> square -> sort
        int[] arr1 = {1, 4, 2, 3};
        Arrays.stream(arr1)
                .boxed()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nRemove duplicate numbers and sort");

        // Remove duplicates from random array
        int[] arr2 = getArray();
        System.out.println("Original: " + Arrays.toString(arr2));
        Arrays.stream(arr2)
                .boxed()
                .distinct()
                .sorted()
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("\nRemove duplicate words");

        //  Remove duplicate words
        String str = "java is very  very easy  java very";
        System.out.println("Original: " + str);
        Arrays.stream(str.split("\\s+"))
                .distinct()
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("\n+ Distinct & sorted words (ASC/DESC)");

        //  Distinct + sort ascending and descending
        String str1 = "java is very easy";
        List<String> words = Arrays.asList(str1.split(" "));

        System.out.print("Ascending: ");
        words.stream().distinct().sorted().forEach(i -> System.out.print(i + " "));
        System.out.print("\nDescending: ");
        words.stream().distinct().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));
        System.out.println();

        System.out.println("\n Word occurrences");

        // Word occurrences
        String str2 = "java is very very very easy easy java easy java easy java easy java";
        Arrays.stream(str2.split(" "))
                .collect(Collectors.groupingBy(word -> word, LinkedHashMap::new, Collectors.counting()))
                .forEach((word, count) -> System.out.println(word + " - " + count));

        System.out.println("\nCharacter occurrences");

        // Character occurrences
        String str3 = "i love java";
        str3.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .forEach((ch, count) -> System.out.println(ch + " - " + count));

        System.out.println("\n Number occurrences");

        // Number occurrences
        int[] arr3 = getArray();
        Arrays.stream(arr3)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, LinkedHashMap::new, Collectors.counting()))
                .forEach((num, count) -> System.out.println(num + " - " + count));
    }
}
