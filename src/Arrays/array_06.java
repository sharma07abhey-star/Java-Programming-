package Arrays;
// Array of other data types ( Double Array )
import java.util.Scanner;
public class array_06 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        double[] arr = new double[5];
        for(int i = 0;i<5;i++){
            arr[i] = inp.nextDouble();
        }
        for(int i = 0;i<5;i++){
            System.out.println(arr[i] + " ");
        }

    }
}
