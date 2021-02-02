/**
 * Created by glenc on Jan 2021
 **/
public class MergeSorter {

    private int nmElem;
    private double[] values;

    public MergeSorter(int max){
        values = new double[max];
        nmElem = 0;
    }

    public void insert(double value){

        values[nmElem] = value;
        nmElem++;
    }

    public void display(){
        for (int j=0;j<nmElem;j++){
            System.out.println(values[j] + " ");
        }
        System.out.println("");
    }
    public void  mergeSort(){
        double[] mergeValuesArray = new double[nmElem];
        mergeSorter(mergeValuesArray,0,nmElem-1);
    }

    private void mergeSorter(double[] mergeValuesArray, int low, int high) {

        int mid  = (low + high) /2;

        if (low == high)
            return;
        else{
            mergeSorter(mergeValuesArray,low,mid);
            mergeSorter(mergeValuesArray,mid+1,high);
            merge(mergeValuesArray,low,mid+1,high);
        }


    }

    private void merge(double[] mergeValuesArray, int lowpos, int highpos, int high) {

        int j=0;
        int low = lowpos;
        int mid = highpos - 1;
        int n = high-low+1;

        while(lowpos <= mid && highpos <= high)
            if (values[lowpos] < values[highpos])
                mergeValuesArray[j++] = values[lowpos++];
            else
                mergeValuesArray[j++] = values[highpos++];


         while(lowpos <= mid)
             mergeValuesArray[j++] =values[lowpos++];

         while(highpos <= high)
             mergeValuesArray[j++] = values[highpos++];

         for (j =0; j < n; j++)
             values[low+j] = mergeValuesArray[j];
    }

    public static void main(String[] args) {



    }
}
