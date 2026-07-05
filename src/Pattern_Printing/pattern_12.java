package Pattern_Printing;
// Hollow Rectangle
import java.util.Scanner;
public class pattern_12 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int m = inp.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(i == 1 || i == n || j == 1|| j == m){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
