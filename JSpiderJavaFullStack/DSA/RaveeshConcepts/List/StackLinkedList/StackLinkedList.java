package JSpiderJavaFullStack.DSA.RaveeshConcepts.List.StackLinkedList;

public class StackLinkedList {

        private Node top = null;
        private int count = 0;

        private static class Node {
            Object element;
            Node next;

            Node(Object element) {
                this.element = element;
                this.next = null;
            }
        }

        public void push(Object e) {
            Node newNode = new Node(e);
            newNode.next = top;
            top = newNode;
            count++;
        }

        public Object pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return null;
            }
            Object e = top.element;
            top = top.next;
            count--;
            return e;
        }

        public Object peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return null;
            }
            return top.element;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int size() {
            return count;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }
            Node current = top;
            System.out.print("Stack elements (Top → Bottom): ");
            while (current != null) {
                System.out.print(current.element + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            StackLinkedList stack = new StackLinkedList();

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            stack.display();
            System.out.println("Top element: " + stack.peek());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Size: " + stack.size());
            stack.display();
        }
    }

