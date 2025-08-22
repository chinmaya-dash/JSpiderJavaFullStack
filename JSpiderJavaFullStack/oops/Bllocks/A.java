package oops.Bllocks;

public class A {
    public static int m1(){
        return 10;
    }
    public static A m2(){
        return new A();
    }
    public static B m3(){
        A a = new A();
B b = a.new B();
return b;
    }

    public static void main(String[] args) {
        A a = m2();
      int b =   m1();
        System.out.println(b);
        B m = m3();
    }
    public  class B{
        {
            System.out.println("non static block of B");
        }
    }
    {
        System.out.println("non static block of A");
    }
}
