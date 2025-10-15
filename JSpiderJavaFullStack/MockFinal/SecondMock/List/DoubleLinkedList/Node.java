package JSpiderJavaFullStack.MockFinal.SecondMock.List.DoubleLinkedList;

public class Node {
     Node next;
     Node previous;
     Object element;

    public Node(Object element){
        this.element = element;
        next = null;
        previous = null;
    }
    public Node (Object element, Node next, Node previous){
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
}
