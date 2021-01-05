/**
 * Created by glenc on Jan 2021
 **/
public class Link {
    protected double value;
    public Link next;
    public Link previous;

    public Link(double value){
        this.value = value;
    }

    public void displayLink(){
        System.out.println(value + " ");
    }
}
