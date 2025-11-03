package JSpiderJavaFullStack.MockFinal.SecondMock.List.ArrayList;

public class Test {
    public static void main(String[] args) {
        arrayList a = new arrayList();
        a.add(12);
        a.add(23);
        a.add(34);
        a.add(45);

a.add(4, 56);
a.remove(4);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
