package Methods.Ques_Methods;
// Sum of N Numbers
import java.util.Scanner;
public class hard_1 {
    public static void main(String[] args){
        System.out.println(sumofrange());
    }
    public static int sumofrange(){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int sums = 0;
        for(int i = 1;i<=n;i++){
            sums += i;
        }
        return sums;
    }
}
