package Pattern_Printing;
// Star triangle vertically Flipped
import java.util.Scanner;
public class pattern_17 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

//        Method 1 :
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n;j++){
//                if((i + j) > n) System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }

//        Method 2
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n+1-i;j++) {
                System.out.print("  ");  // spaces
            }
            for(int j = 1;j<=i;j++){
                System.out.print("* ");  // stars
            }
            System.out.println();
        }
    }
}
