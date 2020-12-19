/**
 * Created by glenc on Dec 2020
 **/
public class DoubleEndedLink {
    public double valueDouble;
    public DoubleEndedLink next;

    public DoubleEndedLink(double value){
        valueDouble = value;
    }
    public void displayLink(){
        System.out.println(valueDouble + "  ");
    }
}

class DoubleEndedList{
    private DoubleEndedLink first;
    private DoubleEndedLink last;


    public DoubleEndedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(double dd) {
        DoubleEndedLink newLink = new DoubleEndedLink(dd);
        if (isEmpty())
            last = newLink;
        newLink.next = first;
        first = newLink;


    }
        public void insertLast(double dd){
            DoubleEndedLink newLink = new DoubleEndedLink(dd);
            if (isEmpty())
                first = newLink;
            else
                last.next = newLink;

            last = newLink;


        }

        public double deleteFirst(){

        double temp = first.valueDouble;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp;

    }

    public void displayList(){
        System.out.println("List from first to Last");
        DoubleEndedLink current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }

        System.out.println("");
    }



}
