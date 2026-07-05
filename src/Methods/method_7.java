package Methods;
// pass by value and reference
public class method_7 {
    public static void main(String[] args){
//    pass by value
        int x = 6;
        System.out.println(x);
        change(x);
        System.out.println(x);
//    pass by reference
        int y = 7;
        System.out.println(y);
        chang(y);
        System.out.println(y);
    }
    public static void change(int x){
        x = 10;
    }
    public static void chang(int y){
        y = 10;
        System.out.println(y);
    }
}


