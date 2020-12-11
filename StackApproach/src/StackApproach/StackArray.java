package StackApproach;

/**
 * Created by glenc on Dec 2020
 **/
public class StackArray {

    private int maxSize;
    private double[] stackArray;
    private int top;

    public StackArray(int size){
        maxSize = size;
        stackArray = new double[maxSize];
        top = -1;

    }

    public void push(double j){
        stackArray[++top] = j;
    }

    public double pop(){
        return stackArray[top--];
    }

    public double peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize-1);
    }

    public static void main(String[] args) {

        StackArray arrStack = new StackArray(12);

        //push to stack
        arrStack.push(20);
        arrStack.push(40);
        arrStack.push(60);
        arrStack.push(70);

        //pop off content from stack while the stack is not empty
        System.out.println("values popped from stack");
        while( !arrStack.isEmpty()){
            double value = arrStack.pop();
            //print the popped value
            System.out.println(value);
            System.out.println(" ");
        }
        System.out.println("");
    }

}
