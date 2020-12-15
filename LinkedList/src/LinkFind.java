/**
 * Created by glenc on Dec 2020
 **/
public class LinkFind {

    public int valueInt;
    public double valueDouble;
    public LinkFind next;

    public LinkFind(int id, double dd){
        valueInt = id;
        valueDouble = dd;
    }

    public void displayLink(){
        System.out.println("{ "+valueInt +" , "+ valueDouble +" }");
    }

    static class LinkListFind{

        public LinkFind first;

        public LinkListFind(){}

        public void insert(int id, double dd){
            LinkFind newLink = new LinkFind(id,dd);
            newLink.next = first;
            first = newLink;
        }

        public LinkFind find(int key){
            LinkFind current = first;
            while (current.valueInt != key){
                if (current.next == null)
                    return null;
                else
                    current = current.next;
            }
            return current;
        }

        public LinkFind delete(int key){
            LinkFind current = first;
            LinkFind previous = first;
            while(current.valueInt != key) {
                if (current.next == null)
                    return null;
                else {
                    previous = current; //hold the value currently at hand
                    current = current.next;
                }
            }
            //if found and link equals first, change first to point to the next or second link
            if (current == first)
                first = first.next;
            else
                previous.next = current.next; //else jus pass old link next to current link next

            return current;
        }

        public boolean isEmpty(){
            return (first == null);
        }


        public void displayList(){
            System.out.println("start from the beginning");
            LinkFind current = first;

            while(current != null){
                current.displayLink();
                current = current.next;
            }

        }

    }
}
