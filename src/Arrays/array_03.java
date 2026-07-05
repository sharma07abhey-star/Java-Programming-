package Arrays;
// Print only negative elements of an array
import java.util.Scanner;
public class array_03 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        int n = inp.nextInt();
        int[] arr  = new int[n];
        System.out.println("Enter " +n+" values in array");
        for(int i = 0;i<n;i++){
            arr[i] = inp.nextInt();
        }
        System.out.println("The positive values you entered are ");
        for(int i = 0;i<n;i++){
            if(arr[i] >= 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
