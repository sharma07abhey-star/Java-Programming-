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