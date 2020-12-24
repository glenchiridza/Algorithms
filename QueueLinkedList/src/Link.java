/**
 * Created by glenc on Dec 2020
 **/
public class Link {

    public double dData;
    public Link  next;

    public Link(double d){
        dData = d;

    }

    public void displayLink(){
        System.out.println(dData + " ");
    }


}

class DoubleEndedLinkList {

    private Link first;
    private Link last;

    public DoubleEndedLinkList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(double dd){
        Link newLink = new Link(dd);
        if (isEmpty())
            last = newLink;
        else
            newLink.next = first;
        first = newLink;
    }

    public void insertLast(double dd){
        Link newLink = new Link(dd);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public double deleteFirst(){
        Link temp = first;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp.dData;
    }

    public void displayList(){
        Link current = first;
        while (current != null){

            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}