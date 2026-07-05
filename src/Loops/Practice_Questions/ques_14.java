package Loops.Practice_Questions;
// Fibonacci Sequence
import java.util.Scanner;
public class ques_14 {
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1;i<=n;i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
