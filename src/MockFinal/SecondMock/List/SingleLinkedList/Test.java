package JSpiderJavaFullStack.MockFinal.SecondMock.List.SingleLinkedList;

public class Test {
    public static void main(String[] args) {
        singleLinkedList list = new singleLinkedList();

        // five add commands
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // one get()
        int valueAt2 = (int) list.get(2);
        System.out.println("get(2) -> " + valueAt2);

        // one remove()
        list.remove(1);
        System.out.println("After remove(1) -> " + list.toString());

        // add(index, element)
        list.add(1, 99);
        System.out.println("After add(1, 99) -> " + list.toString());

    }
}
