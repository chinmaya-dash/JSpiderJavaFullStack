package JSpiderJavaFullStack.MockFinal.SecondMock.Queue.LinkedListQueue;

public class Node {
    public Object element;
    public Node next;

    public Node(Object element){
        this.element = element;
        next = null;
    }
    public Node (Object element, Node next){
        this.element = element;
        this.next = next;
    }
}
