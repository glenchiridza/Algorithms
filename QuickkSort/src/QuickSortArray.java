/**
 * Created by glenc on Feb 2021
 **/
public class QuickSortArray {

    private double[] value;
    private int nmElem;

    public QuickSortArray(int max){

        value = new double[max];
        nmElem = 0;
    }

    public void insert(double value){
        this.value[nmElem++] = value;
    }

    public int size(){
        return nmElem;
    }

    public void displayContent(){
        System.out.println("values are: ");
        for(int  i=0;i<nmElem;i++){

            System.out.println(value[i]);
        }
        System.out.println("");
    }


    public void quickSort(){
        sorter(0,nmElem-1);
    }

    private void sorter(int left, int right) {



            if (right-left <= 0) //one element in array
                return;
            else {
                double pivot = value[right];
                int partition = partion(left,right,pivot);
                sorter(left,partition-1); //sort left
                sorter(partition+1,right); //sort right
            }

    }

    private int partion(int left, int right, double pivot) {

        int leftRef = left - 1;
        int rightRef = right;

        while(true){
            while(value[++leftRef] < pivot); //bigger value

            while(rightRef > 0 && value[--rightRef] > pivot); //get smaller

            if (leftRef >= rightRef)
                break;  //if they cross each other's boundaries
            else
                swap(leftRef,rightRef);
        }
        swap(leftRef,right); //restore pivot
        return leftRef;
    }

    private void swap(int v1,int v2)
    {
        double temp;
        temp = value[v1];
        value[v1] = value[v2];
        value[v2] = temp;
    }


}

