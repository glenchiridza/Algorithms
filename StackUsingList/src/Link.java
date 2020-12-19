/**
 * Created by glenc on Dec 2020
 **/
public class Link {
    public double valueDouble;
    public Link next;

    public Link(double dd){
        valueDouble = dd;
    }

    public void displayLink(){
        System.out.println(valueDouble + " ");
    }


}

class LinkList {
    private Link first;

    public LinkList(){
        first = null;
    }

    public void insertFirst(double value){

        Link newLink = new Link(value);
        newLink.next = first;
        first = newLink;


    }

    public double deleteFirst(){

        Link temp = first;
        if (isEmpty())
            throw new NullPointerException("no data");

        first = first.next;

        return temp.valueDouble;

    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void displayList(){
        System.out.println("Link first to last");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
    }
}
