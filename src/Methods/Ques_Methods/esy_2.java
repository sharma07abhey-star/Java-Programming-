package Methods.Ques_Methods;
// Greeting Generator
import java.util.Scanner;
public class esy_2 {
    public static void main(String[] args){
        greet();
    }
    public static int greet(){
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        System.out.println("Hello " + name +" !");
        return 0;
    }
}
