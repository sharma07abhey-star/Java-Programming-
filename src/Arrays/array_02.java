package Arrays;
// Array Input and output
import java.util.Scanner;
public class array_02 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = inp.nextInt();
        }
        for(int i = 0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
    }
}