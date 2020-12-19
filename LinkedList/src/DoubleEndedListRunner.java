/**
 * Created by glenc on Dec 2020
 **/
public class DoubleEndedListRunner {

    public static void main(String[] args) {
        DoubleEndedList myList = new DoubleEndedList();

        myList.insertFirst(12.0);
        myList.insertFirst(13.20);
        myList.insertFirst(15.5);


        myList.insertLast(188.09);
        myList.insertLast(12.12);
        myList.insertLast(90.9082);


        myList.displayList();

        myList.deleteFirst();
        myList.deleteFirst();

        myList.displayList();


    }
}
