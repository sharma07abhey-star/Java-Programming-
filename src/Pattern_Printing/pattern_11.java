package Pattern_Printing;
// Inverted Aplhabet Triangle
import java.util.Scanner;
public class pattern_11 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = n;i>=1;i--){
            for(int j = i;j>=1;j--){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
