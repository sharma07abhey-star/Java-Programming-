package Methods.Ques_Methods;
// Factorial of a number
public class hard_2 {
    public static void main(String[] args){
        System.out.println(factorial(6));
    }
    public static int factorial(int a){
        int b = 1;
        for(int i = 1;i<=a;i++){
            b = b * i;
        }
        return b;
    }
}
