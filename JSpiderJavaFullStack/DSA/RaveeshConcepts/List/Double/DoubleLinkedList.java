package JSpiderJavaFullStack.DSA.RaveeshConcepts.List.Double;

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
    public void reverse(){
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
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.add(2, 25);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
        list.reverse();
        System.out.println("Reversed: " + list);
    }
}
