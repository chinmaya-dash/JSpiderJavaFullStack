package Recursion;

public class recursionPractice {
    public static void main(String[] arg) {
        m1(1);
    }

    static void m1(int i) {
        System.out.println(i);
        if (i >= 5) return;
        m1(++i);
        System.out.println(i);
        m1(++i);
        System.out.println(i);
    }
}

