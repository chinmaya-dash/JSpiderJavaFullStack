package DSA.RaveeshConcepts.List.LinkedListQueue;

    public class LinkedListQueue {
    private Node first = null;
    private Node last = null;
    private int count = 0;

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
    public int size(){
        return count;
}

    public boolean isEmpty(){
       return count == 0;
    }

    public Object peek(){
        return first.element;
    }

    public Object poll(){
        if (isEmpty()) return null;

        Object e = first.element;
        for (int i = 1; i < size(); i++) {
            first = first.next;
        }
        if (first == null) last = null;
        count--;
        return e;
    }

        public static void main(String[] args) {
            LinkedListQueue q = new LinkedListQueue();
            q.add(10);
            q.add(20);
            q.add(30);
            q.add(40);
            q.add(50);
            q.add(60);
            System.out.println(q.size());
        }

}
