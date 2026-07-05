package Arrays;
// Second - Largest Element in an array
import java.util.*;
public class array_13 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 elements :");
        for(int i = 0;i<5;i++){
            arr[i] = inp.nextInt();
        }
        int mi = Integer.MIN_VALUE;
        int ma = Integer.MIN_VALUE;
        for(int i = 0;i<5;i++){
            if(arr[i] >ma){
                ma = arr[i];
            }
        }
        for(int i = 0;i<5;i++){
            if(arr[i] > mi && arr[i] < ma){
                mi = arr[i];
            }
        }
        System.out.println("Second Max is : ");
        System.out.println(mi);
    }
}
