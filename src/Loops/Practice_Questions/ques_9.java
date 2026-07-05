package Loops.Practice_Questions;
// Factorial Finder
import java.util.Scanner;
public class ques_9 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = 1;
        for(int i = 1;i<=a;i++){
            b = b*i;
        }
        System.out.println(b);
    }

}
