package DSA.RaveeshConcepts.List.Double;

public class Double_Node {
    Double_Node next;
    Double_Node previous;
    Object element;
    public Double_Node(Object element, Double_Node next, Double_Node previous){
        this.element = element;
        this.next = next;
        this.previous = previous;
    }
}
