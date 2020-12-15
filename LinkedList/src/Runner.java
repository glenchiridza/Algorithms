/**
 * Created by glenc on Dec 2020
 **/
public class Runner {

    public static void main(String[] args) {

        Link.LinkList myList = new Link.LinkList();
        myList.insert(12,220.00);
        myList.insert(2,22.00);
        myList.insert(1,20.00);
        myList.insert(22,2.00);

        myList.displayList();

        while(!myList.isEmpty()){
            Link link = myList.deleteFirst();
            System.out.println("item deleted");
            link.displayLink();
            System.out.println(" ");

        }
        //display after deletion
        myList.displayList();
    }

}
