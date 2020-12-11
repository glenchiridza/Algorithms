/**
 * Created by glenc on Nov 2020
 **/
public class Array {


    public static void main(String[] args) {
        //arrays and linear search  and deletion


        int[] arr = new int[100];
        int nEl =0;
        int searchKey;

        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
        nEl = 10;

        //traversing the array
        for (int i = 0; i < nEl; i++){
            System.out.println(arr[i]);
        }

        //linear search

        searchKey = 33;
        for (int i = 0; i < nEl; i++){
            if (searchKey == arr[i]){
                System.out.println("found element "+ arr[i] + "at index " + i);
                break;
            }
            if (i == nEl -1){
                System.out.println("element not found");
            }
        }



        //deletion

        int sechKey = 44;

        for( int i = 0; i < nEl; i++){
            if (sechKey == arr[i]) {
                for (int j = i; j < nEl; j++)
                    arr[j] = arr[j + 1];
                nEl--;
                break;

            }
            if (i == nEl-1){
                System.out.println("item for deletion does not exist");
            }


        }

        System.out.println("after deletion \n\n");
        for (int i = 0; i< nEl; i++){
            System.out.println(arr[i]);
        }



    }





}
