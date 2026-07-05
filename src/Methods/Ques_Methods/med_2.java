package Methods.Ques_Methods;
// A person is eligible to vote or not
public class med_2 {
    public static void main(String[] args){
        vote(1);
    }
    public static int vote(int a){
        if(a>=18) System.out.println("Eligible");
        else System.out.println("Not Eligible");
        return 0;
    }
}
