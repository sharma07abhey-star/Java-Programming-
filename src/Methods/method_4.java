package Methods;
// Return type in methods
public class method_4 {
    public static int abhey(){
        System.out.println("Abhey Sharma");
        return 0;
        // As the datatype is int so we have to return integer at the end  .
        // without return keyword it will not work ;
    }
    public static void main(String[] args){
        abhey();
        int x = abhey();
        System.out.println(x);
        System.out.println(abhey());
    }
}
