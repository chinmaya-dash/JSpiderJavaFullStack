package JSpiderJavaFullStack.MockFinal.SecondMock.List.SingleLinkedList;

public class singleLinkedList {
/*In single LinkedList
* first create node, second Node , element count as p
* then create add(), size(), add at index(), get(), remove(), toString(), reverse()*/

    private Node first;
    private Node last;
    private int count = 0;

    public void add(Object e){
        if (first == null){
            first = new Node(e);
            last = first;
            count++;
            return;
        }
//        Node current = first;
//        while (current.next != null){
//            current = current.next;
//        }
//        current.next = new Node(e);
//        last = current.next;
        last.next = new Node(e);
        last = last.next;
        count++;
    }
    public int size(){
        return count;
    }
    public void add(int index, Object e){
        if (index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException("Index : "+index);
        }
        if (index == 0){
            first = new Node(e, first);
            count++;
            return;
        }
        Node current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = new Node(e, current.next);
        count++;
    }
    public Object get(int index){
        if (index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException("Index : "+index);
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
            if (first == null)last = null;
            count--;
            return;
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next == null)last = current;
        count--;
    }

    public void reverse(){
        Node previous = null;
        Node current = first;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        first = previous;
    }

    @Override
    public String toString(){
        if (size() == 0)return "[]";
        StringBuilder s = new StringBuilder("[" + first.element);

        Node current = first;

        while (current.next != null){
            current = current.next;
            s.append(current.element);
        }
        s.append("]");

        return s.toString();
    }
}
