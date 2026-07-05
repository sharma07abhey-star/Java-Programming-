package Pattern_Printing;
// Small case alphabet square ;
import java.util.Scanner;
public class pattern_5 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print((char)(j+96) + " ");
            }
            System.out.println();
        }
    }
}
