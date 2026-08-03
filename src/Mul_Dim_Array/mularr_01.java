package Mul_Dim_Array;
import java.util.Scanner;

public class mularr_01 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for(int i = 0;i<5;i++){
            for(int j = 0;j<5;j++){
                arr[i][j] = inp.nextInt();
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
