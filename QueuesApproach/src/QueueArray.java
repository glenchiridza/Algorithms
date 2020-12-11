/**
 * Created by glenc on Dec 2020
 **/

/**
this QueueArray uses a counter (nItems) to keep track of the exist number of elements
 **/

public class QueueArray {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;


    public QueueArray(int size){
        maxSize = size;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }


    public void insert(int j){
        if (rear == maxSize-1)
            rear = -1; //deal with wrap around
        queArray[++rear] = j; //increment rear and insert one more item
        nItems++;
    }

    //take item from front of queue
    public int remove(){
        int temp = queArray[front++];
        //deal with wrap around
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    //peek at front of the queue
    public int peekFront(){

        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems==maxSize);
    }
    public int size(){
        return nItems;
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(6);
        queueArray.insert(10);
        queueArray.insert(30);
        queueArray.insert(50);
        queueArray.insert(70);

        queueArray.remove();
        queueArray.remove();
        queueArray.remove();

        queueArray.insert(80);
        queueArray.insert(90);
        queueArray.insert(100);

        System.out.println("Removed items");
        while(!queueArray.isEmpty()){
            int n = queueArray.remove();
            System.out.println(n);
        }
        System.out.println("");
    }

}
