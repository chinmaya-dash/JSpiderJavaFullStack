package FactoryMethode;

import java.util.Scanner;

public class staticNonstaticMethode {
   static String name;
     int age;
    int id;
     long salary;


    public static staticNonstaticMethode m1(){
        Scanner sc = new Scanner(System.in);
        staticNonstaticMethode st = new staticNonstaticMethode();
        name = sc.next();
        st.id = sc.nextInt();
        st.age = sc.nextInt();
        st.salary = sc.nextLong();
//                System.out.println(st.name+"\n"+st.age+"\n"+st.id+"\n"+st.salary);
        sc.close();

        return st;
    }
     void display(){
//        staticNonstaticMethode st = m1();
        System.out.println(name+"\n"+age+"\n"+id+"\n"+salary);
    }
    public static void main(String [] args){
        staticNonstaticMethode st = m1();
        st.display();
    }
}
