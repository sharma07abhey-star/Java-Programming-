package Loops.Practice_Questions;
// The FizzBuzz Loop
import java.util.Scanner;
public class ques_10 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        for(int i = 1;i<=a;i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
}
