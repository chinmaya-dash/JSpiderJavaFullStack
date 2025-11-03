package MockFinal.SecondMock.Stack.LinkedListStack;

import java.util.EmptyStackException;

public class linkedListStack {
    private Node first;
    private Node last;
    private int count = 0;

    public int size(){
        return  count;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void push (Object e){
         first = new Node(e, first);
         count++;
    }

    public Object peek(){
        if (isEmpty())throw new EmptyStackException();
        return first.element;
    }

    public Object pop(){
        if (isEmpty())throw new EmptyStackException();
        Object temp = first.element;
        first = first.next;
        if (first == null)last = null;
        count--;
        return temp;
    }
}
