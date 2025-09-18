package FactoryMethode;

import java.util.Scanner;

public class Demo {
    String n;
    int age;
    int id;

    public static Demo m1(){
        Scanner sc = new Scanner(System.in);
        Demo d = new Demo();
        d.n = sc.next();
        d.age = sc.nextInt();
        d.id = sc.nextInt();
                sc.close();

        return d;
    }
public void display(){
    System.out.println("Name = "+n+" age = "+age+" id = "+id);
}
    public static void main(String[] args) {
        Demo demo = m1();
demo.display();
    }

}
