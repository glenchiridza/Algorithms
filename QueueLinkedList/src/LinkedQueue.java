/**
 * Created by glenc on Dec 2020
 **/
public class LinkedQueue {

    private DoubleEndedLinkList myList;
    public LinkedQueue(){
        myList = new DoubleEndedLinkList();
    }

    public boolean isEmpty(){
        return myList.isEmpty();
    }

//    public void insert(double value){
//        myList.insertFirst(value);
//    }
    public void insert(double value){
        myList.insertLast(value);
    }
    public double remove(){
        return myList.deleteFirst();
    }

    public void displayQueue(){
        System.out.println("Queue (front --> rear");
        myList.displayList();
    }
}
