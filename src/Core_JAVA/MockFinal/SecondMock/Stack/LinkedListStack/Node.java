package MockFinal.SecondMock.Stack.LinkedListStack;

public class Node {
    public Object element;
    public Node next;

    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    public Node(Object element) {
        this.element = element;
        next = null;
    }
}
