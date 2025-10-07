package DSA.RaveeshConcepts.List.Single;

public class LinkedList {
    private Node first = null;
    private Node last = null;
    public int count = 0;

    public int size() {
        return count;
    }

    public void add(Object e) {
        if (first == null) {
            first = new Node(e, null);
            last = first;
            count++;
            return;
        }
        // Node current = first;
        // while (current.next != null){
        // current = current.next;
        // }
        // current.next = new Node(e, null);
        // count++;
        // }

        last.next = new Node(e, null);
        last = last.next;
        count++;
    }

    public void add(int index, Object e) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Indexx : " + index);
        }
        if (index == 0) {
            first = new Node(e, first);
            count++;
            return;
        }
        Node current = first;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = new Node(e, current.next);
        count++;
    }

    public void remove(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Indeex : " + index);
        }
        if (index == 0) {
            first = first.next;
            if (first == null)
                last = null;
            count--;
            return;
        }
        Node current = first;
        for (int i = 1; i < index; i++) { 
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next == null)
            last = current;
        count--;
    }

    public void reverse() {
        Node previous = null;
        Node current = first;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        first = previous;
    }

    @Override
    public String toString() {
        if (size() == 0)
            return "[]";
        String s = "[" + first.element;
        Node current = first;
        while (current.next != null) {
            current = current.next;
            s = s + "," + current.element;
        }
        s = s + "]";
        return s;
    }

    public Object get(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Index : " + index);
        }
        Node temp = first;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
    }

    public static void main(String[] args) {

        LinkedList test = new LinkedList();
        System.out.println(test.size());
        test.add(12);
        test.add(13);
        // test.remove(test.size()-2);
        System.out.println(test);

    }
}
