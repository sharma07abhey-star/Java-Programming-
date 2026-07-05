package Loops.Practice_Questions;
// Count Digits
import java.util.Scanner;
public class ques_8 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int digits = 0;
        while (a!=0){
            a = a/10;
            digits ++;
        }
        System.out.println(digits);
    }
}
