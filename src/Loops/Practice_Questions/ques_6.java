package Loops.Practice_Questions;
// Multiplication table
import java.util.Scanner;
public class ques_6 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        for(int i = 1 ; i<11;i++){
            System.out.println(a + " X " + i +" = " + a*i);
        }
    }
}
