package oops;

import java.util.Scanner;

public class oops {
    String name;
    int age;
    static int id;

    static {// static block ie used to initialize all the static members of class it does
            // allow nonstatic members after object is created not directly
        System.out.println("static block 1");
    }

    public oops() {// constructor

    }

    public oops loadOops() {
        Scanner sc = new Scanner(System.in);
        oops o = new oops();
        name = sc.next();
        age = sc.nextInt();
        id = sc.nextInt();
        sc.close();
        return o;
    }

    public void display() {//

        System.out.println(name + "\t" + age + "\t" + id);
    }

    static {
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        // oops oops = new oops();// object creation
        new oops();
    }

    {
        System.out.println("Non static block 3");
    }
    static {
        System.out.println("static block 4");
    }
    {
        System.out.println("non static block 5");
    }
}
