package Arrays;
// print sum of all elements of an array
import java.util.Scanner;
public class array_04 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        int n = inp.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = inp.nextInt();
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Total Sum of Elements is " + sum);
    }
}
