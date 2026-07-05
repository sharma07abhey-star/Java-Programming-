package Loops.Practice_Questions;
// Star Pattern
import java.util.Scanner;
public class ques_13 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        for(int i = 0;i<a;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
