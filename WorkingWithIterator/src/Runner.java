/**
 * Created by glenc on Jan 2021
 **/
public class Runner {

    public static void main(String[] args) {
        System.out.println("Series: "+ triangle(20));
    }

    public static int triangle(int n){
        if (n == 1) {

            towers(4,'A','b','C');
            return 1;
        }
        else
            return n + triangle(n-1);
    }

    public static void towers( int topNum, char from, char mid, char to){
        if (topNum == 1){
            System.out.println("Disk 1 from " + from + "to "+to);
        }else{
            towers(topNum-1,from,to,mid);
            System.out.println("Disk 1 from " + from + "to "+to);
            towers(topNum-1,mid,from,to);
        }
    }
}


