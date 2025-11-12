package MockFinal.SecondMock.Stack.ArrayStack;

public class ArrayStack {

    private Object[] a = new Object[5];
    private int p = 0;

    public int size(){
        return p;
    }
    public boolean isEmpty(){
        return size() == 0;
    }

    public void push(Object e){
        if (p >= a.length)increaseSize();
        a[p++] = e;
    }

    private void increaseSize(){
        Object [] temp = new Object[a.length+a.length];

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public Object peek(){
        if (isEmpty())return null;

        return a[p-1];
    }

    public Object pop(){
        if (isEmpty())return null;

        Object temp = a[--p];
        a[p] = null;
        return temp;
    }


}