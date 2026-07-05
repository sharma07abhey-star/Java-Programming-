package Pattern_Printing;
// Alphabet Triangle
import java.util.Scanner;
public class pattern_10 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print((char)(j+65) + " ");
            }
            System.out.println();
        }
    }
}
