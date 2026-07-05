package If_Else.Practice_Questions;
// Greatest of 3
import java.util.Scanner;
public class ques_5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
        if(a>b && a>c){
            System.out.println( a + " is greatest ");
        }else if(b>a && b>c){
            System.out.println(b + " is greatest ");
        }else System.out.println(c +" is greatest ");
    }
}
