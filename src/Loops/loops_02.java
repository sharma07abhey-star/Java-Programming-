package Loops;
// print numbers by taking input from user using for loop
import java.util.Scanner ;
public class loops_02 {
    public static void main(String[] args ){
        Scanner oo = new Scanner(System.in);
        int a = oo.nextInt() ;
        for(int i = 1;i<=a;i++){
            System.out.println(i);
        }
    }
}
