package ArraySorting;

/**
 * Created by glenc on Dec 2020
 **/
public class InsertionSort {

    private double[] a;
    private int nmElem;

    public InsertionSort(int max) {
        a = new double[max];
        nmElem = 0;
    }

    public void insert(double value) {
        a[nmElem] = value;
        nmElem++;
    }

    public void display() {
        for (int i = 0; i < nmElem; i++)
            System.out.println(a[i] + " ");
        System.out.println();
    }

    //InsertionSort

    public void insert(){
        int in, out;

        for (out = 1; out < nmElem; out++){
            double temp = a[out];
            in  = out;

            while(in > 0 && a[in-1] >= temp){
                a[in] = a[in-1];
                //go one position left
                --in;
            }
            //the next takes the position of the previous
            a[in] = temp;
        }
    }

    public static void main(String[] args)
    {
        int maxSize = 100;
        InsertionSort arr;
        arr = new InsertionSort(maxSize);
arr.insert(77);
arr.insert(99);
arr.insert(44);
arr.insert(55);
arr.insert(22);
arr.insert(88);
arr.insert(11);
arr.insert(00);
arr.insert(66);
arr.insert(33); // insert 10 items
arr.display(); // display items
arr.insert(); // insertion-sort them
arr.display();
} // end main()

}