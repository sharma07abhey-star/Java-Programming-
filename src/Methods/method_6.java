package Methods;
// Method Overloading
public class method_6 {
    public static void main(String[] args){
        printvalue(10);
        printvalue(10.5);
    }
    public static void printvalue(int a){
        System.out.println("Integer Value :" + a);
    }
    public static void printvalue(double a){
        System.out.println("Double Value :" +a);
    }
}

// you named both methods printValue but gave them different input requirements
// (one wants an int, the other wants a double), the Java compiler acts as a traffic controller.
// When you call printValue(10), it sees the input is a whole number,
// so it sends it to the int method. When you call printValue(10.5), it sees the decimal,
// so it routes it to the double method.


// how function overloading is resolved :
// firstly, Java compiler tries to find the exact match , this is the key where the actual arguments
// exactly matches with the formal arguments of the overloaded function .
// second , if no exact match is found , Java compiler tries to find out a match through promotion
// third , if no promotion is found , java compiler tries to find out a match through standard conversion