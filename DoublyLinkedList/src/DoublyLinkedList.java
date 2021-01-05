/**
 * Created by glenc on Jan 2021
 **/
public class DoublyLinkedList {
    private Link first;
    public Link last;

    public DoublyLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(double item){

        Link newLink = new Link(item);
        if (isEmpty())
            last = newLink;
        else
            first.previous = newLink;
        newLink.next = first;
        first = newLink;

    }
    public void insertLast(double item){
        Link newLink = new Link(item);
        if (isEmpty())
            first = newLink;
        last.next = newLink;
        newLink.previous = last;
        last = newLink;
    }

    public Link deleteFirst(){
        Link temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public Link deleteLast(){
        Link temp = last;
        if (last.previous == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;

        return temp;
    }

    public boolean insertAfter(double key, double item){
        Link current = first;
        while (current.value != key){

            current = current.next;
            if (current == null)
                return false;

        }
        Link newLink = new Link(item);
        if (current == last){
            newLink.next = null;
            last = newLink;
        }else{
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next  = newLink;
        return true;
    }

    public Link deleteKey(double key){
        Link current = first;
        while (current.value != key){
            current = current.next;

            if (current == null)
                return null;
        }

        if (current == first)
            first = current.next;
        else
            current.previous.next = current.next;
        if (current == last)
            last = current.previous;
        else
            current.next.previous = current.previous;

        return current;
    }

    public void displayForward(){
        System.out.println("Listing first to last");
        Link current = first;

        while (current != null){

            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackWard(){
        System.out.println("Listing last to first");
        Link current = last;
        while(current != null){
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }
}
