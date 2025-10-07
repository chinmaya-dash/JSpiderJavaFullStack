package DSA.RaveeshConcepts.List.Double;

public class DoubleLinkedList {
    private D_Node first;
    private D_Node last;
    private int count;

    public void add(Object e) {
        if (first == null) {
            first = new D_Node(e);
            last = first;
            count++;
            return;
        }
        last.next = new D_Node(e, null, last);
        last = last.next;
        count++;
    }

    public int size() {
        return count;
    }

    public void add(int index, Object e) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (index == 0) {
            D_Node n = new D_Node(e, first, null);
            first.previous = n;
            first = n;
            count++;
            return;
        }
        D_Node current = first;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        D_Node n = new D_Node(e, current.next, current);
        current.next.previous = n;
        current.next = n;
        count++;
    }

    public void remove(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }
        if (index == 0) {
            first = first.next;
            if (first != null) {
                first.previous = null;
            } else {
                last = null;
            }
            count++;
            return;
        }
        D_Node current = first;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next != null) {
            current.next.previous = current;
        } else {
            last = current; 
        }
        count--;

    }

}
