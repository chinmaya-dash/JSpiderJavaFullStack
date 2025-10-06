package DSA.RaveeshConcepts.List;

public class DoubleLinkedList {
    private D_Node first = null;
    private D_Node last = null;
    public int count = 0;

    public int size() {
        return count;
    }

    public void add(Object e) {
        D_Node newD_Node = new D_Node(e, null, last);
        if (first == null) {
            first = newD_Node;
            last = newD_Node;
        } else {
            last.next = newD_Node;
            last = newD_Node;
        }
        count++;
    }

    public void add(int index, Object e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        if (index == 0) {
            D_Node newD_Node = new D_Node(e, first, null);
            if (first != null)
                first.previous = newD_Node;
            first = newD_Node;
            if (last == null)
                last = first;
            count++;
            return;
        }

        if (index == size()) { // Add at end
            add(e);
            return;
        }

        D_Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        D_Node newD_Node = new D_Node(e, current, current.previous);
        current.previous.next = newD_Node;
        current.previous = newD_Node;
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        if (index == 0) {
            first = first.next;
            if (first != null)
                first.previous = null;
            else
                last = null;
            count--;
            return;
        }

        D_Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.next != null)
            current.next.previous = current.previous;
        else
            last = current.previous;

        current.previous.next = current.next;
        count--;
    }

    public void reverse() {
        D_Node current = first;
        D_Node temp = null;

        while (current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }

        if (temp != null) {
            last = first;
            first = temp.previous;
        }
    }

    @Override
    public String toString() {
        if (size() == 0)
            return "[]";
        StringBuilder s = new StringBuilder("[" + first.element);
        D_Node current = first;
        while (current.next != null) {
            current = current.next;
            s.append(", ").append(current.element);
        }
        s.append("]");
        return s.toString();
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        D_Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }

    public static void main(String[] args) {
        DoubleLinkedList test = new DoubleLinkedList();
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(1, 15);
        System.out.println(test); // [10, 15, 20, 30]
        test.remove(2);
        System.out.println(test); // [10, 15, 30]
        test.reverse();
        System.out.println(test); // [30, 15, 10]
        System.out.println("Element at index 1: " + test.get(1));
        System.out.println("Size: " + test.size());
    }
}
