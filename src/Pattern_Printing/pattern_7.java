package Pattern_Printing;

import java.util.Scanner;

// Number Triangle
public class pattern_7 {
    public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
    for(int i = 1;i<=n;i++){
        for(int j = 1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}
