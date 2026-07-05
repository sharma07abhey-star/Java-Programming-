package Pattern_Printing;
// Star Plus
import java.util.Scanner;
public class pattern_13 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=5;i++){
            for(int j = 1;j<=5;j++){
                if (i == 3 || j == 3){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
