package MockFinal.SecondMock.Queue.ArrayQueue;

public class ArrayDequeue {
    public Object [] a = new Object[5];
    public int p = 0;

    public int size(){
        return  p;
    }
     public boolean isEmpty(){
        return size() == 0;
     }
    public void add(Object e){
        if (p >= a.length)increaseSize();
        a[p++] = e;
    }
    private void increaseSize(){
        Object [] temp = new Object[a.length + a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public Object peek(){
        if (isEmpty())return null;
        return a[0];
    }

    public Object poll(){
        if (isEmpty())return null;

        Object e = a[0];
        for (int i = 1; i < size(); i++) {
            a[i-1] = a[i];
        }
        a[--p] = null;
        return e;
    }
}
