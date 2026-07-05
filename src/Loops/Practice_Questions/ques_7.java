package Loops.Practice_Questions;
// Sum of Natural Numbers
import java.util.Scanner;
public class ques_7 {
    public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    int a = inp.nextInt();
    int x = 0;
    for(int i = 0;i<=a;i++){
        x += i;
    }
    System.out.println(x);
    }
}
