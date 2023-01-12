
public class Node<E> {

    private Node <E> next;
    private Node<E> previous;
    private E currentElement;

    public Node(E currentElement, Node<E> previous, Node<E> next) {
        this.currentElement = currentElement;
        this.previous = previous;
        this.next = next;
    }

    public Node(){}

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public E getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(E currentElement) {
        this.currentElement = currentElement;
    }
}
