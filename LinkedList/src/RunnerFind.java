/**
 * Created by glenc on Dec 2020
 **/
public class RunnerFind {
    public static void main(String[] args) {

        LinkFind.LinkListFind linkListFind = new LinkFind.LinkListFind();
        linkListFind.insert(12,30.00);
        linkListFind.insert(13,30.120);
        linkListFind.insert(123, 182.90);
        linkListFind.insert(77,76.70);
        linkListFind.insert(133,12.1131);

        linkListFind.displayList();

        LinkFind find = linkListFind.find(13);

        if (find != null)
            System.out.println("Item found with key "+ find.valueInt +" and amount "+ find.valueDouble);
        else
            System.out.println("Not found");

        LinkFind del = linkListFind.delete(12);
        if (del != null)
            System.out.println("Item deleted with key "+ del.valueInt +" and amount "+ del.valueDouble);
        else
            System.out.println("item for deletion not found");

        linkListFind.displayList();
    }
}
