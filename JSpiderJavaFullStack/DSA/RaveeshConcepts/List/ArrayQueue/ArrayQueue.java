package JSpiderJavaFullStack.DSA.RaveeshConcepts.List.ArrayQueue;

public class ArrayQueue {
    private Object[] a = new Object[5];
    private int p = 0;

    public void add(Object e) {
        if (p >= a.length)
            increase();
        a[p++] = e;
    }

    private void increase() {
        Object[] temp = new Object[a.length + a.length];
        for (int i = 1; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public Object peek(){
        if (isEmpty()) return  null;

        return a[0];
    }

    public Object pool(){
        if (isEmpty()) return null;
        Object e = a[0];
        for (int i = 1; i < size(); i++) {
            a[i-1] = a[i];
        }
        a[--p] = null;
        return e;
    }
    public int size() {
        return p;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println(q.size());
//        System.out.println();
    }
}
