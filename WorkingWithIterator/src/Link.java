import java.util.ListIterator;

/**
 * Created by glenc on Jan 2021
 **/
public class Link {
    public double value;
    public Link next;

    public Link(double value){
        this.value = value;
    }

    public void displayLink(){
        System.out.println(value + " ");
    }

    class MyLinkedList {

        private Link first;

        public MyLinkedList(){
            first = null;
        }
        public void setFirstLink(Link first){
            this.first = first;
        }

        public Link getFirstLink(){
            return first;
        }

        public boolean isEmpty(){
            return first==null;
        }

        public CustomListIterator getIterator(){

            return new CustomListIterator(this);
        }

        public void displayList(){
            Link current = first;
            while(current != null){
                current.displayLink();
                current = current.next;
            }
            System.out.println("");
        }

    }
}
