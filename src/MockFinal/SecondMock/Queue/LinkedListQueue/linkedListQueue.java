package MockFinal.SecondMock.Queue.LinkedListQueue;

public class linkedListQueue {
    private Node first;
    private Node last;
    private int count = 0;

    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return size() == 0;
    }
    public void add(Object e){
        if (first == null){
            first = new Node(e);
            last = first;
            count++;
            return;
        }
        last.next = new Node(e);
        last = last.next;
        count++;
    }
    public Object poll(){
        if (isEmpty())return null;
        Object n = first.element;
        first = first.next;
        if (first == null)last =null;
        count--;
        return n;
    }

    public Object peek(){
        if (isEmpty()) return null;
        return first.element;
    }
}
