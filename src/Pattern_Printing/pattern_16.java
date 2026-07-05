package Pattern_Printing;
// 0 and 1 Triangle
import java.util.Scanner;
public class pattern_16 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                if(i == j|| ((i+j)%2) == 0){
                    System.out.print("1 ");
                }
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
