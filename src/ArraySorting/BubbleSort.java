package ArraySorting;

/**
 * Created by glenc on Nov 2020
 **/
public class BubbleSort {

    private double[] a;
    private int nmElem;

    public BubbleSort(int max){
        a = new double[max];
        nmElem = 0;
    }

    public void insert(double value){
        a[nmElem] = value;
        nmElem++;
    }

    public void display(){
        for (int i = 0; i < nmElem; i++)
            System.out.println(a[i] + " ");
        System.out.println();
    }


    //bubble support

    public void bubbleSort(){
        int out, in;

        for (out=nmElem-1; out > 1; out--){
            for (in =0; in < out; in++){
                if (a[in] > a[in+1])
                    swap(in, in+1);
            }
        }

    }//end bubble sort

    private void swap(int one, int two){
        double temp  = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public static void main(String[] args) {

        int maxSize = 100;
// array size
        BubbleSort arr = new BubbleSort(maxSize); // create the array
        arr.insert(77);// insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        arr.bubbleSort();

        arr.display();
    }
}
