/**
 * Created by glenc on Feb 2021
 **/
public class Runner {

    public static void main(String[] args) {

        int size = 11;
        QuickSortArray qarr = new QuickSortArray(size);
        for (int i =0;i < size;i++){
            double value = (int) (Math.random() * 100);
            qarr.insert(value);
        }
        qarr.displayContent();
        qarr.quickSort();

        qarr.displayContent();
    }
}
