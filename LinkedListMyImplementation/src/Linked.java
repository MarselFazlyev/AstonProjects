public interface Linked<E> {
    void addFirst(E e);

    void addLast(E e);

    E get(int i);

   int size();
}
