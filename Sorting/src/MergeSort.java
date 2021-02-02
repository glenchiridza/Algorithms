/**
 * Created by glenc on Jan 2021
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] A = {21,10,88,44};
        int[] B = {6,7,2,9,18,5,22};
        int[] C = new int[11];

        merge(A,4,B,6,C);
        display(C,11);
    }

    public static void merge(int[] A, int sA, int[]B,int sB,int[] C){

        int a = 0, b = 0, c =0;
        while(a< sA && b < sB){ //if both arrays are not empty

            if (A[a] < B[b])
                C[c++] = A[a++];
            else
                C[c++] = B[b++];

        }
        while(a < sA) //array B is empty but not array A
            C[c++] = A[a++];
        while(b < sB) //array A empty but not array B
            C[c++] = B[b++];
    }

    public static void display(int[]C , int s){

        for (int j = 0; j <s;j++)
            System.out.println(C[j] + " ");
        System.out.println("");
    }
}
