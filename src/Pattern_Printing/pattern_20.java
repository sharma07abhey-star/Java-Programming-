package Pattern_Printing;
// Rhombus
import java.util.Scanner;
public class pattern_20 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<= n+1-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
