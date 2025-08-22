package oops.PassingObjectAsAParameter;

import java.util.Scanner;

public class passingObjectAsParameter {
    int x;
    int y;
    int z;
    public passingObjectAsParameter assign(){
        Scanner sc = new Scanner(System.in);
        passingObjectAsParameter p = new passingObjectAsParameter();
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        sc.close();
        return p;
    }
    class A{
        int i;
        int j;
    }
//    public static A m2(){
//        return new A();
//    }
    public void display(){
        System.out.println("x = "+x+"y = "+y+"z = "+z);
//        System.out.println("i = "+i+" j = "+j);

    }

    public static void main(String[] args) {
        passingObjectAsParameter pm = new passingObjectAsParameter();
pm.assign();
pm.display();

    }
}
