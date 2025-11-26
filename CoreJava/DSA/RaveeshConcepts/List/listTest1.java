package JSpiderJavaFullStack.DSA.RaveeshConcepts.List;

public class listTest1 {
    private Object[] a = new Object[5]; // Initial array of size 5
    private int p = 0; // Not static so it can be different for each object

    // Add element at the end of the list
    public void add(Object e) {
        if (p >= a.length)
            increaseArraySize(); // Ensure capacity
        a[p++] = e;
    }

    // Increase array size when capacity is full
    private void increaseArraySize() {
        Object[] temp = new Object[a.length + a.length]; // double the size

        System.arraycopy(a, 0, temp, 0, a.length);
        // the above line does the down line
        /*
         * for (int i = 0; i < a.length; i++) {
         * temp[i] = a[i];
         * }
         */
        a = temp;
    }

    // Add element at a specific index
    public void add(int index, Object e) {
        if (index < 0 || index > p) { // Check valid index
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (p >= a.length)
            increaseArraySize(); // Ensure capacity

        // Shift elements to the right to make space
        for (int i = p - 1; i >= index; i--) {
            a[i + 1] = a[i];
        }
        a[index] = e;
        p++;
    }

    // Return current size
    public int size() {
        return p;

    }

    // Get element at index
    public Object get(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return a[index];
    }

    // Remove element at index
    public void remove(int index) {
        if (index <= -1 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        for (int i = index + 1; i < size(); i++) {
            a[i - 1] = a[i];
        }
        a[--p] = null; // Clear last element after shifting
    }

    public String toString() {
        if (size() == 0)
            return "[]";
        String s = "[" + a[0];
        for (int i = 1; i < a.length; i++) {
            s = s + "," + a[i];
        }
        s += "]";
        return s;
    }

    // Main method for testing
    public static void main(String[] args) {
        listTest1 test1 = new listTest1();

        // Adding elements
        test1.add(12);
        test1.add(13);
        test1.add(11);
        test1.add(14);
        test1.add(17);
        test1.add(3, 15); // Insert 15 at index 3
        test1.add(16);
        test1.add(4, 10); // Insert 10 at index 4
        test1.add(112);
        // test1.add(10, 123); // Insert 123 at index 10

        // ❌This will throw IndexOutOfBoundsException
        // test1.add(100, 152);

        // Accessing elements
        System.out.println("Element at index 3: " + test1.get(3));
        System.out.println("Element at index 4: " + test1.get(4));
        System.out.println("Element at index 5: " + test1.get(5));

        // This will throw IndexOutOfBoundsException
        // System.out.println(test1.get(31));

        // Removing elements
        test1.remove(3);
        test1.remove(4);

        // These will throw IndexOutOfBoundsException
        // test1.remove(15);
        // test1.remove(1);

        // Display remaining elements
        System.out.print("Final elements: ");
        // for (int i = 0; i < test1.size(); i++) {
        // System.out.print(test1.get(i) + " ");
        // }
        System.out.println(test1);
        System.out.println(test1.size());
    }

    public void test1() {

        // intValue() To get primitive value from wrapper type object

        // Integer s = new Integer(10); // this is deprecated since java version 9
        // Integer s = 10;
        // System.out.println(s.intValue());//explicitly calling intValue()
        // System.out.println(s);//implicitly java call the intValue()

        Object o = 10;// here Object o = (Object) new Integer (10); - here 10 is implicitly autoboxing
                      // to integer type class upcasting to Object class
        System.out.println(o);// String type out put by toString() (o.intValue().toString())

        // System.out.println(o*2); // it is not possible because the o is Object type
        // it can not use Integer (subclass) type methode so we need to down cast it
        // explicitly
        System.out.println((Integer) o * 2);// downcast the Object type to Integer Type

    }
}