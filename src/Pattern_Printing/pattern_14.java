package Pattern_Printing;
// Star cross
import java.util.Scanner;
public class pattern_14 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(i == j|| j == (n-i) +1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
