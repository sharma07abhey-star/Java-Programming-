package Pattern_Printing;
// Pyramid
import java.util.Scanner;
public class pattern_21 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n+1-i;j++){
//                System.out.print("  ");
//            }
//            for(int j = 1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n+1-i;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
