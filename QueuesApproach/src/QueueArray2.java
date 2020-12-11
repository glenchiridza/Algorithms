/**
 * Created by glenc on Dec 2020
 **/

/**
 * this queue uses no counter to iterate through the number of items,
 * which reduces the overhead in large amounts of data
 **/

public class QueueArray2 {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;

    public QueueArray2(int size){

        maxSize = size+1; //make array one cell large to avoid queue appearing empty and full at the same time, as there is no counter of items to maintain, when and when not full
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void insert(int j){
        if (rear == maxSize -1)
            rear = -1;
        queArray[++rear] = j;
    }

    public int remove(){
        int temp = queArray[front++];
        if (front == maxSize)
            front = 0;
        return temp;
    }

    public int peek(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (rear + 1 == front || (front + maxSize-1 == rear));
    }

    public boolean isFull(){
        return (rear+2==front || (front+maxSize-2 == rear));
    }

    public int size(){
        if (rear >= front)
            return rear-front+1;
        else
            return (maxSize-front) + (rear+1);
    }

}
