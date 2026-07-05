package Arrays;
// Built In methods to sort arrays
import java.util.Arrays;
public class array_11 {
    public static void main(String[] args){
        // sort - Ascending Order
        int[] arr = {9,80,67,-45,18,11,4};
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
