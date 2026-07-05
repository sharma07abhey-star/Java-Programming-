package Pattern_Printing;
// Alphabet Pattern vertically flipped
import java.util.Scanner;
public class pattern_19 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<= n + 1 - i ;j++){
                System.out.print("  "); // Spaces
            }
            for(int j = 1;j<=i;j++){
                System.out.print((char)(i+64) + " "); // Alphabets
            }
            System.out.println();
        }
    }
}
