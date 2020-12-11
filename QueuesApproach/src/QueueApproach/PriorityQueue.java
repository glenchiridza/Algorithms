package QueueApproach;

/**
 * Created by glenc on Dec 2020
 **/

//queue items are prioritize base on item with teh lowest index
public class PriorityQueue {

    private int maxSize;
    private double[] queArray;
    private int nItems;


    public PriorityQueue(int size){
        maxSize = size;
        queArray = new double[maxSize];
        nItems = 0;
    }

    public void insert(double value){
        int j;

        if (nItems==0)
            queArray[nItems++] = value;
        else{

            for (j=nItems-1; j>=0; j--){ //start at end

                if (value > queArray[j])
                    queArray[j+1] = queArray[j]; //shift upward so the larger/priority goes infront
                else
                    break; //done shifting / smaller
            }

            queArray[j+1] = value; //insert value after shifting complete
            nItems++;
        }
    }

    public double remove(){
        return queArray[--nItems];
    }
    public double peekMin(){
        return queArray[nItems-1];
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return (nItems == maxSize);
    }

}
