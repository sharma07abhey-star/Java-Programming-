package Pattern_Printing;
// Rectangle Pattern ;
import java.util.Scanner;
public class pattern_1 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Length of rectangle ");
        int n = inp.nextInt();
        System.out.println("Enter Width of rectangle ");
        int m = inp.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
