/**
 * Created by glenc on Dec 2020
 **/
public class ListStack {
    private LinkList linkList;

    public ListStack(){
        linkList = new LinkList();
    }

    public  void push(double value){
        linkList.insertFirst(value);
    }

    public double pop(){
        return linkList.deleteFirst();
    }

    public boolean isEmpty(){
        return linkList.isEmpty();
    }

    public void displayStack(){
        System.out.println("stack contents first to last");
        linkList.displayList();
    }
}
