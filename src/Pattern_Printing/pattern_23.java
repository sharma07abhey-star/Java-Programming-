package Pattern_Printing;
// Hollow triangle pattern
import java.util.Scanner;
public class pattern_23 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<=i;j++){
                if(i == n || j == 0 || j == i){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}