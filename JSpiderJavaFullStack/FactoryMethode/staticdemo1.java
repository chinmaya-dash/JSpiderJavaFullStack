package FactoryMethode;

import java.util.Scanner;

public class staticdemo1 {
    static int i;
    int j;
    public static staticdemo1 demo(){
        Scanner sc = new Scanner(System.in);
        staticdemo1 sd = new staticdemo1();
        sd.j = sc.nextInt();
        i = sc.nextInt();
        return sd;
    }
    void displlay(){
        System.out.println(i+"\n"+j);
    }
    public static void main(String [] args){
        staticdemo1 sd = demo();
        sd.displlay();
    }
}
