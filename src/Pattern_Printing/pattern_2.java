package Pattern_Printing;
// Square Pattern ;
import java.util.Scanner;
public class pattern_2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        for(int i = 0;i<a;i++){
            for(int j = 0;j<a;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
