package Arrays;
// Print the maximum element in the array
import java.util.Scanner;
public class array_05 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number of Elements : ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = inp.nextInt();
        }
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
    }
}
