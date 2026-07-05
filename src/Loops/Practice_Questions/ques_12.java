package Loops.Practice_Questions;
// Reverse a Number
import java.util.Scanner;
public class ques_12 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int rev = 0;
        while(a>0){
            int digit = a%10;
            rev = rev * 10 + digit;
            a /=10;
        }
        System.out.println(rev);
    }
}
