package datastructures;

/**
 * doubly linked list of Integer values
 */
public class LinkedList {

    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.addFirst(4);
        System.out.println(list);
        System.out.println("index of 6: " + list.indexOf(6));
        System.out.println("index of 2: " + list.indexOf(2));
    }
    private static class Node {
        private Node prev;
        private Integer element;
        private Node next;

        Node(Node pre, Integer element, Node post) {
            this.prev = pre;
            this.element = element;
            this.next = post;
        }
    }

    transient Node first;

    transient Node last;

    private int size;

    public LinkedList() {
    }

    // positional modification operations

    public boolean add(Integer e) {
        addLast(e);
        return true;
    }

    public void addFirst(Integer e) {
        final Node f = first;
        final Node newNode = new Node(null, e, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
        System.out.println(String.format("Element %d added to first.", e));

    }

    public void addLast(Integer e) {
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
        System.out.println(String.format("Element %d added to last.", e));
    }

    public Integer removeFirst() {
        final Node f = first;
        final Integer elem = first.element;
        final Node next = first.next;
        first = next;
        f.element = null;
        f.next = null;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        return elem;
    }

    public Integer removeLast() {
        final Node l = last;
        final Integer elem = last.element;
        final Node prev = last.prev;
        last = prev;
        l.element = null;
        l.prev = null;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
        size--;
        return elem;
    }


    // positional access operations

    public Integer get(int index) {
        checkIndex(index);
        return node(index).element;
    }

    /**
     * returns the (non-null) node at specified index, provided that index is legal
     *
     * @param index
     * @return
     */
    private Node node(int index) {
        if (index < (size >> 1)) {
            Node x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node x = last;
            for (int i = size - 1; i < index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    /**
     * assert index is legal before adding/getting element
     *
     * @param index
     */
    private void checkIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    public Integer getFirst() {
        if (first == null) {
            return null;
        }
        return first.element;
    }

    public Integer getLast() {
        if (last == null) {
            return null;
        }
        return last.element;
    }

    // Search Operations

    /**
     * returns the index of the first occurrence of the specified element
     *
     * @param elem
     * @return the index or -1 if this list does not contain the element
     */
    public int indexOf(Integer elem) {
        int index = 0;
        if (elem == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.element == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (elem.equals(x.element)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" | ");
        for (Node x = first; x != null; x = x.next){
            sb.append(x.element);
            sb.append(" | ");
        }
        return sb.toString();
    }
}
