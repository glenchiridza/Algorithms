/**
 * Created by glenc on Feb 2021
 **/
public class PartitionArray {

    private double[] arr;
    private int numElems;

    public PartitionArray(int max){
        arr = new double[max];
        numElems = 0;
    }

    public void insert(double value){
        arr[numElems] = value;
        numElems++;
    }

    public int size(){
        return numElems;

    }

    public void display() {
        System.out.println("Elememnts in array: \n");
        for (int j=0;j<numElems;j++)
            System.out.println(arr[j] +" ");;
        System.out.println("");
    }

    public int partitionIt(int left, int right, double pivot){
        int leftRef = left - 1;
        int rightRef = right + 1;
        while(true){
            while(leftRef < right && arr[++leftRef]<pivot); //find huge item

            while(rightRef > left && arr[--rightRef] > pivot); //find small

            if(leftRef >= rightRef)
                break;
            else
                swap(leftRef,rightRef);
        }
        return leftRef;
    }

    private void swap(int v1,int v2)
    {
        double temp;
        temp = arr[v1];
        arr[v1] = arr[v2];
        arr[v2] = temp;
    }

    public static void main(String[] args) {
        int maxSize = 16;
        PartitionArray arr;
        arr = new PartitionArray(maxSize);

        for (int j=0;j<maxSize;j++){
            double value = (int)(Math.random() *101);
            arr.insert(value);
        }
        arr.display();

        double pivot = 51;

        System.out.println("my pivot point is"+pivot);
        int size = arr.size();

        int parttion = arr.partitionIt(0,size-1,pivot);
        System.out.println("partition is at point: "+parttion);
        arr.display();
    }
}
