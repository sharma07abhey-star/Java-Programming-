package Pattern_Printing;
// Flipped Triangle
import java.util.Scanner;
public class pattern_8 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = n;i>0;i--){
            for(int j = i;j>0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
