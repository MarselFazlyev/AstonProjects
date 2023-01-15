import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.addLast(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.addLast(6);
        myList.addLast(8);
        myList.addLast(12);
        myList.addLast(40);
        myList.addLast(11);

        System.out.println(myList.get(7));




    }
}
