package If_Else.Practice_Questions;
// Convert celsius to fahrenheit
import java.util.Scanner;
public class ques_1 {
    public static void main(String[] args){
        Scanner cel = new Scanner(System.in);
        int celsius = cel.nextInt();
        double fahr = (celsius * 1.8 ) + 32 ;
        System.out.println(fahr);
    }
}
