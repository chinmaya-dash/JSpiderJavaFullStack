package oops;

public class demo1 {
    int a;
    int b;

    public void assign(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void display(){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        demo1 d1 = new demo1();
        demo1 d2 = new demo1();
        demo1 d3 = new demo1();

        d1.assign(10,20);
        d1.display();
        d2.assign(30,40);
        d2.display();
        d3.assign(50,60);
        d3.display();
    }
}
