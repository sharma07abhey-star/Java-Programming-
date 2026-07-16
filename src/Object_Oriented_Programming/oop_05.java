package Object_Oriented_Programming;
// Example of Private
class student{
    private String name;
    private int rollNumber ;
    private void showSecretCode(){
        System.out.println("Secret Internal method");
    }
}
public class oop_05 {
    public static void main(String[] args){
        student s1 = new student();
        // s1.name = " Ravi";   // error , name is private , cant access
        // s1.showSecretCode   // error , method is private too
    }
}