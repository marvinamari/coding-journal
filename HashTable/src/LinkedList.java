package src;
public class LinkedList {

    public class Node {

        private String info;   
        private Node next;  

        public Node() {
            info = null;
            next = null;
        }

        public void setInfo(String i) {
            info = i;
        }

        public void setNext(Node l) {
            next = l;
        }

        public String getInfo() {
            return info;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node first;

    public LinkedList() {
        first = new Node();
    }

    public boolean isEmpty() {
        return (first.getNext() == null);
    }

    public void display() {
        Node current = first.getNext();

        while (current != null) {
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

    public boolean search(String x) {
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo().equalsIgnoreCase(x) ) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void add(String x) {
        Node p = new Node();

        p.setInfo(x);
        p.setNext(first.getNext());

        first.setNext(p);
    }

    public void remove(String x) {
        Node old = first.getNext(),
                p = first;

        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo().equalsIgnoreCase(x)) {
                found = true;
            }
            else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }
    }

    public void insert(int x, int loc) {

    }

    public void removeItemAt(int loc) {

    }
}
