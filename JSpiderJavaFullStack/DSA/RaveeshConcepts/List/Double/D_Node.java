package DSA.RaveeshConcepts.List.Double;

public class D_Node {
    D_Node next;
    D_Node previous;
    Object element;
    public D_Node(Object e){
        element = e;
        next = null;
        previous = null;
    }
    public D_Node(Object element, D_Node next, D_Node previous){
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
}
