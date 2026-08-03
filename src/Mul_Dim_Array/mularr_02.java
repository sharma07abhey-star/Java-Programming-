package Mul_Dim_Array;
import java.util.Scanner;

// Transpose of a Matrix
public class mularr_02 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                arr[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0;i<5;i++){
            for(int j= 0;j<5;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}