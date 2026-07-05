package Pattern_Printing;
// Alphabet Square ;
import java.util.Scanner;
public class pattern_4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=a;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}