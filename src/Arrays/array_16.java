package Arrays;
// Rotate an Array
import java.util.*;
public class array_16 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] arr = {1,11,4,7,81};
        System.out.println("Enter number of elements to rotate ");
        int d = inp.nextInt();
        for(int i = 0;i<d;i++){
            int temp = arr[0];
            for(int j = 0;j<(arr.length - 1);j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = temp ;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }

    }
}
