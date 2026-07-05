package Methods;
// Function with parameters inside it .
public class method_3 {
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        sum(5,8);
        multiply(7,9);
    }
    public static void multiply(int a,int b){
        System.out.println(a*b);
    }
}

// In Java the order of declaration of methods does not matter , we can
// declare method after or before main function and it will work perfectly
