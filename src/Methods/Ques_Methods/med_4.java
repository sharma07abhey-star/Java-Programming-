package Methods.Ques_Methods;
// Find LCM
import java.util.*;
public class med_4 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int gc = gcd(a,b);
        int lcm = (a*b)/gc;
        System.out.println(lcm);
    }
    public static int gcd(int a,int b){
        int gd = 1;
        for(int i = 1;i<=a;i++){
            if(a%i == 0 && b%i ==0){
                gd = i;
            }
        }
        return gd;
    }
}
