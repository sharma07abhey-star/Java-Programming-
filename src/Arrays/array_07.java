package Arrays;
// Array of other data types  ( String array )
import java.util.Scanner;
public class array_07 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number of Names");
        int n = inp.nextInt();
        inp.nextLine();  // This is added because it consumes the left over new line . 

//        String[] arr = {"","",""};   another way to initialize an array of strings

        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = inp.nextLine();
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
