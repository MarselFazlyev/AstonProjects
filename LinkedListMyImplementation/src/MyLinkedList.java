import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyLinkedList<E> implements Linked<E> {
    private Node<E> first = new Node<>();
    private Node<E> last = new Node<>();
    private int size = 0;

    public MyLinkedList() {
    }

    @Override
    public void addLast(E e) {
        Objects.requireNonNull(e);
        if (first.getCurrentElement() == null) {
            first.setCurrentElement(e);
        } else {
            Node<E> temp = first;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<>(e, temp, null));
            last = temp;
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
        while (temp.getNext() != null) {
            if (count == i) break;
            temp = temp.getNext();
            count++;
        }
        return temp.getCurrentElement();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void remove(int i) {
        //todo сделать после перестрелки
    }


    @Override
    public void addFirst(E e) {
        //todo сделать после перестрелки
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

