import java.util.ArrayList;
import java.util.List;

public class MyLinkedList<E> implements Linked<E> {
    private Node<E> first = new Node<>();
    private Node<E> last = new Node<>();
    private int size = 0;

    public MyLinkedList() {
    }

    @Override
    public void addLast(E e) {
        if (first.getCurrentElement() == null) {
            first.setCurrentElement(e);
        } else {
            Node<E> temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            last = temp;
            last.setCurrentElement(e);

        }
        size++;
    }

    @Override
    public E get(int i) {
        Node<E> temp;
        if (i > (size - 1)) throw new IndexOutOfBoundsException("Индекс превышает размер связного списка");
        if (i == 0) return first.getCurrentElement();

        int count = 0;
        temp = first;
        while (temp.getNext()!=null) {
           if (count==i) break;
           temp=temp.getNext();
           count++;
        }
        return temp.getCurrentElement();
    }

    @Override
    public int size() {
        return this.size;
    }


    @Override
    public void addFirst(E e) {

    }

    public String toString() {
        List<E> list = new ArrayList<>();
        int index = 0;
        Node<E> temp = first;
        while (temp.getNext() != null) {
            temp = temp.getNext();
            list.add(index, temp.getCurrentElement());
            index++;
        }
        return list.toString();
    }
}

