package MockFinal.SecondMock.List.DoubleLinkedList;

public class DoubleLinkedList {
    public Node first;
    public Node last;
    public int count = 0;

    public void add(Object e){
        if (first == null){
            first = new Node(e);
            last = first;
            count++;
            return;
        }
        last.next = new Node(e, null, last);
        last = last.next;
        count++;
    }
    public int size(){
        return count;
    }
    public void add(int index, Object e){
        if (index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            Node n = new Node(e, first, null);

            first.previous = n;
            first = n;
            count++;
            return;
        }

        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        Node n = new Node(e, current.next, current);
        current.next.previous = n;
        current.next = n;
        count++;
    }

    public Object get(int index){
        if (index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            return first.element;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }

    public void remove(int index){
        if (index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            first = first.next;
            if (first == null){
                last = null;
            }else{
                first.previous = null;
            }
            count--;
        }

        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        if (current.next == null){
            last = current;
        }else{
            current.next.previous = current;
        }
        count--;
    }
    public void reverse(){
        Node current = first;
        Node n = null;

        while (current != null){
            n = current.previous;
            current.previous = current.next;
            current.next = n;
            current = current.previous;
        }

        if (n != null){
            last = first;
            first = n.previous;
        }
    }
    @Override
    public String toString(){
        if (size() == 0)return "[]";

        StringBuilder s = new StringBuilder("["+first.element);
        Node current = first;
        for (int i = 0; i < size(); i++) {
            current = current.next;
            s.append(current.element);
        }
        s.append("]");
        return s.toString();
    }
}













