package Pattern_Printing;
// Floyd's triangle
import java.util.Scanner;
public class pattern_15 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int a = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
