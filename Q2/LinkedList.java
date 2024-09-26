import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {

    private static class Node<T> {

        private T value;
        private Node<T> prev;
        private Node<T> next;

        private Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    public LinkedList() {
        head = new Node<E>(null, null, null); // dummy node!
        head.prev = head.next = head;
        size = 0;
    }

    private class LinkedListIterator implements Iterator<E> {
        //private int index_holder = 0;
        private Node<E> current = head;

        public boolean hasNext() {
            return (current.next != head);
        }

        public E next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            current = current.next;
            //index_holder++;

            return current.value;
        }
    }
    // public int nextIndex(){
           
    //     return index_holder;
    // }

    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    public Iterator<E> iterator(int nextIndex){
    if(nextIndex > size() || nextIndex < 0){
        throw new IndexOutOfBoundsException("the given index is out of bounds");
    }
    
    Node<E> p = head.next;

        for (int i = 0; i < nextIndex - 1; i++) {
            p = p.next;
        }


        LinkedListIterator newITer = new LinkedListIterator();
        newITer.current = p;
        newITer.index_holder = nextIndex;

        return newITer;

    }
    @SuppressWarnings("unchecked")
    public Iterator<E> iterator(Iterator<E> other){
        if(other == null){
            throw new IllegalArgumentException("the input is null");
        }

        LinkedListIterator otherIt = null;

        
        otherIt = (LinkedListIterator) other;
        
        if (otherIt != null) {
            LinkedListIterator myiterator = new LinkedListIterator();
            myiterator.current = otherIt.current;
            myiterator.index_holder = otherIt.index_holder;
            return myiterator;

        } 

        return otherIt;
        
    }

    public int size() {
        return size;
    }

    public E get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }

        Node<E> p = head.next;

        for (int i = 0; i < index; i++) {
            p = p.next;
        }

        return p.value;
    }

    public void addFirst(E elem) {

        if (elem == null) {
            throw new NullPointerException();
        }

        Node<E> second = head.next;

        head.next = new Node<E>(elem, head, second);
        second.prev = head.next;

        size++;
    }

    public void add(E elem) {

        if (elem == null) {
            throw new NullPointerException();
        }

        Node<E> before = head.prev, after = head;

        before.next = new Node<E>(elem, before, after);
        after.prev = before.next;

        size++;
    }
    
}
