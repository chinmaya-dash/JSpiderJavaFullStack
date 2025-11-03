package JSpiderJavaFullStack.MockFinal.SecondMock.List.SingleLinkedList;

public class Node {
    Object element;
    Node next;

    public Node(Object element) {
        this.element = element;
        this.next = null;
    }
    public Node(Object element, Node next){
        this.element = element;
        this.next = next;
    }
}
