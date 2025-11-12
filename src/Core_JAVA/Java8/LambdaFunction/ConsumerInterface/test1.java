package Java8.LambdaFunction.ConsumerInterface;

import DSA.RaveeshConcepts.Simple.Emp;

import java.util.function.Consumer;

public class test1 {
    public static void main(String[] args) {
        Emp e1 = new Emp("chinmaya", 50000);
        Emp e6 = new Emp("tanmaya", 5000);
        Emp e2 = new Emp("chinmayee", 10000);
        Emp e3 = new Emp("pramod", 5000000);
        Emp e4 = new Emp("king", 900000000);
        Emp e5 = new Emp("john", 999999999);
        Emp[] s = new Emp[]{e1, e2, e3, e4, e5, e6};
        Consumer <Emp>consumer = i -> System.out.println(i.name+"\t"+i.id+"\t"+ i.salary);

        for (Emp n : s){
            consumer.accept(n);
        }
    }
}
