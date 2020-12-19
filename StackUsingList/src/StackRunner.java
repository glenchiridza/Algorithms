/**
 * Created by glenc on Dec 2020
 **/
public class StackRunner {

    public static void main(String[] args) {
        ListStack theStack = new ListStack(); // make stack

        theStack.push(12.2);
        theStack.push(9.999);

        theStack.displayStack();

        theStack.push(0.926);
        theStack.push(3.0);

        theStack.displayStack();

        theStack.pop();
        theStack.pop();

        theStack.displayStack();

    }
}
