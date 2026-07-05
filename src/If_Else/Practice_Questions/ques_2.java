package If_Else.Practice_Questions;
// Even or Odd
import java.util.Scanner;
public class ques_2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if(a%2 == 0){
            System.out.println("Even");
        }
        else System.out.println("Odd");
    }
}
