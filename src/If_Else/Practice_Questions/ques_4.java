package If_Else.Practice_Questions;
//Traffic Light Simulator
import java.util.Scanner;
public class ques_4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        String color = inp.nextLine();  // string input in java
        if(color.equalsIgnoreCase("Red")){
            System.out.println("Stop");
        }else if(color.equalsIgnoreCase("Yellow")){
            System.out.println("Slow Down");
        }else if(color.equalsIgnoreCase("Green")){
            System.out.println("Go");
        }else {
            System.out.println("Enter the right color which is Red , Yellow or Green");
        }
    }
}
