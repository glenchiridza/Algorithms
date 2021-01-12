/**
 * Created by glenc on Jan 2021
 **/
public class CustomListIterator {
    private Link current;
    private Link previous;
    private Link.MyLinkedList mylist;

    public CustomListIterator(Link.MyLinkedList ls){
        mylist = ls;
        reset();
    }

    public void reset(){
        current = mylist.getFirstLink();
        previous = null;
    }

    public boolean atEnd(){

        return current.next == null;
    }

    public void next(){
        previous = current;
        current = current.next;
    }

    public Link getCurrent(){
        return current;
    }

    public void insertAfter(double value){
        Link newLink = new Link(value);
        if (mylist.isEmpty()){
            mylist.setFirstLink(newLink);
            current = newLink;
        }
        else{
            newLink.next = current.next;
            current.next = newLink;
            next();
        }
    }

    public void insertBefore(double value){
        Link newLink = new Link(value);
        if (previous == null){
            newLink.next = mylist.getFirstLink();
            mylist.setFirstLink(newLink);
            reset();
        }else{
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }



    public double deleteCurrent(){
        double temp = current.value;
        if (previous == null){
            mylist.setFirstLink(current.next);
            reset();
        }
        else{
            previous.next = current.next;
            if (atEnd())
                reset();
            else
                current = current.next;
        }
        return temp;
    }
}
