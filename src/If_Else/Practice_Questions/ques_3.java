package If_Else.Practice_Questions;
import java.util.Scanner;
// Voting Eligiblity
public class ques_3 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        if(a>=18){
            System.out.println("The Person is eligible to vote");
        }
        else System.out.println("The Person Cannot vote he need " + (18-a) +" years to vote");
    }
}
