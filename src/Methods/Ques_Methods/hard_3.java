package Methods.Ques_Methods;
// Counting digits of integer
public class hard_3 {
    public static void main(String[] args){
        System.out.println(counter(5678));
    }
    public static int counter(int a){
        int count = 0;
        while(a!=0){
            int digits = a%10;
            count += 1;
            a/=10;
        }
        return count;
    }
}
