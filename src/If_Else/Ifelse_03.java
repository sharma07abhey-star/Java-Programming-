package If_Else;
// Selling price and cost price
import java.util.Scanner ;
public class Ifelse_03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price :");
        int cp = sc.nextInt();
        System.out.println("Enter Selling Price :");
        int sp = sc.nextInt();
        if(sp >cp) System.out.println("Profit is "+(sp-cp));
        else if (sp == cp) {
            System.out.println("No profit No loss");
        } else System.out.println("Loss is "+(cp-sp));

    }
}
