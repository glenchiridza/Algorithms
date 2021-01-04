/**
 * Created by glenc on Dec 2020
 **/
public class Link {
    public int valueInt;
    public double valueDouble;
    public Link next;

    public Link(int id, double dd){
        valueInt = id;
        valueDouble = dd;
        //next is set to null automatically
    }

    public void displayLink(){
        System.out.print("{" + valueInt + ", " + valueDouble + "} ");
    }

    static class LinkList{

        private Link first;

        public LinkList(){
            first = null;
        }

        public boolean isEmpty(){
            return (first==null);
        }

        public void insert(int id, double dd){
            Link newlink = new Link(id, dd);
            newlink.next = first;
            first = newlink;
        }

        public Link deleteFirst(){
            Link temp = first;
            first = first.next;
            return temp;
        }

        public void displayList(){
            System.out.println("start from the beginning");
            Link current = first;
            while (current != null){
                current.displayLink();
                current = current.next;
            }
            System.out.println(" ");

        }
        public void insertSorted(int keyInt, double keyDouble){

            Link newLink = new Link(keyInt, keyDouble);
            Link previous = null;
            Link current = first;

            while(current != null && keyInt > current.valueInt){
                previous = current;  //keep hold of the current now in previous
                current = current.next; //move to next value


            }
            //at the beginning, no value yet
            if (previous == null)
                first = newLink;
            else
                previous.next = newLink; //old previous is now referencing newLink, more of like first = newLink, but just that we are at some point in the list therefore previous.next = newLink
            newLink.next = current; //note current is holding first reference


        }



    }


}
