package patterns;
class B{
    int price;

    public B(int price) {
        this.price = price;
    }

    public void display(){
        System.out.println("In B");
    }
}
class A extends B {
    String name;
    int num;
    B b;

    A(String name, int num, B b){
        super(b.price); // ✅ Call parent constructor
        this.name = name;
        this.num = num;
        this.b = b;
    }
}

public class practice2 {
    public static void main(String[] args) {
        A a = new A("jio", 321, new B(123));
        a.display();
    }
}
