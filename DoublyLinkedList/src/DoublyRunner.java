/**
 * Created by glenc on Jan 2021
 **/
public class DoublyRunner {
    public static void main(String[] args) {
        DoublyLinkedList dbList = new DoublyLinkedList();

        dbList.insertFirst(3.3);
        dbList.insertFirst(40.2);
        dbList.insertFirst(6.6); // insert at front

        dbList.insertLast(10.20);
        dbList.insertLast(0.93);
        dbList.insertLast(5.55);

        dbList.displayForward();
        dbList.displayBackWard();

        dbList.deleteFirst();
        dbList.deleteLast();

        dbList.deleteKey(0.93);

        dbList.displayForward();
        dbList.insertAfter(3.3, 65.55);
        dbList.insertAfter(5.55, 10.0);

        dbList.displayForward();

    }
}
