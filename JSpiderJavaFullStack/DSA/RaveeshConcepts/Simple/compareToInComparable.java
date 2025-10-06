package DSA.RaveeshConcepts;

import java.util.Arrays;

public class compareToInComparable {
    public static void main(String[] args) {
        circle[] c = { new circle(10), new circle(20), new circle(30), new circle(90) };
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
