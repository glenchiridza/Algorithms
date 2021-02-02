/**
 * Created by glenc on Jan 2021
 **/
public class ShellSorter {

    private double[] arr;
    private int numElems;

    public ShellSorter(int max){
        arr = new double[max];
        numElems = 0;
    }

    public void insert(double value){
        arr[numElems] = value;
        numElems++;
    }

    public void display(){
        System.out.println("A=");
        for (int j=0;j<numElems;j++)
            System.out.println(arr[j] + " ");
        System.out.println("");
    }

    public void shellSort(){
        int inner, outer;
        double temp;

        int h = 1; //init value of h
        while (h <= numElems/3)
            h = h*3 +1;

        while(h>0){
            for (outer=h; outer<numElems;outer++){
                temp = arr[outer];
                inner = outer;

                while (inner > h-1 && arr[inner-1] >= temp){
                    arr[inner] = arr[inner-h];
                    inner -= h;
                }
                arr[inner] = temp;
            }

            h = (h-1)/3; //decrease h
        }
    }
}
