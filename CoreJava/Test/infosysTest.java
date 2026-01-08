package Test;

import java.util.*;

public class infosysTest {

    public static void main(String[] args) {


//        int [] arr = {9, 4, 9, 6, 7, 4, 9, 6, 7, 4, 3, 2, 6, 1, 2, 4, 0, 2, 6, 4, };
//        removeDuplicate(arr);
        String s = "I am chinmaya dash";
        removeDuplicateChar(s);
    }

    private static void removeDuplicateChar(String s){


    }
    private static void duplicateChar(String s){
        char[] ch = s.toCharArray();
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> duplicate = new HashSet<>();

        for (char c : ch){
            if (!seen.add(c)){
                duplicate.add(c);
            }
        }
        System.out.println(duplicate);
    }
    private static void charOccurance(String s){
        char [] ch = s.toCharArray();
        HashMap<Character, Integer>map = new HashMap<>();
        for(char c : ch){
            if (map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

    private static void removeDuplicate(int [] a){
//        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int j : a){
            duplicates.add(j);
        }
        System.out.println(duplicates);
    }
    private static void duplicateElement(int [] a){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int i : a){
            if (!seen.add(i)){
                duplicates.add(i);
            }
        }
        System.out.println( duplicates.toString());
    }

    private static void numberOccurance(int [] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j : a){
//            if (map.containsKey(j)){
//                map.put(j, map.get(j)+1);
//            }else{
//                map.put(j, 1);
//            }
            map.put(j, map.getOrDefault(j, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }

}
