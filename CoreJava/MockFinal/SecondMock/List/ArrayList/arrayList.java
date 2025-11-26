package MockFinal.SecondMock.List.ArrayList;

public class arrayList {
    /*In ArrayList
     * first create Object Array, element count as p
     * then create add(), size(), add at index(), get(), remove(), toString(), reverse()*/

    private Object[] a = new Object[5];
    int p = 0;

    public void add(Object e){
        if (p >= a.length)increaseArraySsize();

        a[p++] = e;
    }
    public int size(){
        return p;
    }

    private void increaseArraySsize(){
        Object[] temp = new Object[a.length+a.length];

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a=temp;
    }

    public void add(int index, Object e){
      if (p >= a.length){increaseArraySsize();}

        for (int i = size()-1; i >= index; i--) {
            a[i+1] = a[i];
        }
        a[index] = e;
        p++;
    }

    public Object get(int index){
       if (index <= -1 || index >= size()){
           throw new IndexOutOfBoundsException();
       }
        return a[index];
    }

    public void remove(int index){
        if (index <= -1 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        for (int i = index+1; i < size(); i++) {
            a[i-1] = a[i];
        }
        a[--p] = null;

    }

}
