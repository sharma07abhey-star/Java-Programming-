package Loops.Practice_Questions;
// Prime Number Checker
import java.util.Scanner;
public class ques_11 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        boolean isprime = true;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }if(isprime){
            System.out.println("Prime Number");
        }else System.out.println("Not prime");
    }
}
