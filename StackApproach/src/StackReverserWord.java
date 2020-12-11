import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by glenc on Dec 2020
 **/
public class StackReverserWord {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackReverserWord(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    //push the characters from specified string in the caller
    public void push(char c){
        stackArray[++top] = c;
    }

    //remove value at last index
    public char pop(){
        return stackArray[top--];
    }

//    return value of last index
    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

}//end class stack


class Reverse {

    private String input;
    private String output;

    public Reverse(String in){
        input = in;
    }

    public String reverseString(){
        //get size from input
        int stackSize = input.length();
        StackReverserWord srw = new StackReverserWord(stackSize);

        for (int i=0; i<stackSize; i++){
            char ch = input.charAt(i);
            srw.push(ch);
        }
        output = "";
        while( !srw.isEmpty()){
            char ch = srw.pop();
            output = String.format("%s", output + ch);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        String input, output;
        while(true){
            System.out.println("Input a String");

            input = getString();

            if (input.equals(""))
                break;

            Reverse theReverser = new Reverse(input);
            output = theReverser.reverseString();
            System.out.println("Reversed String : "+ output);
        }

    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

}

