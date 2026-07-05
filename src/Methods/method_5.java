package Methods;
// Return statement is mandatory
public class method_5 {
    public static void main(String[] args){
        int x = pro(7);
        System.out.println(3+x);
    }
    public static int pro(int a){
        System.out.println("NOT");
        if(a>0) return 5;
        else return 10;  // The return statement is mandatory to run the code in java .
        // Without return statement the code will give error .
    }
}