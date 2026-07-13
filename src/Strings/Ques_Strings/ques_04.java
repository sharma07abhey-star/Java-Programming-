package Strings.Ques_Strings;
import java.util.Arrays;
// Anagrams
public class ques_04 {
    public static void main(String[] args){
        String s1 = "abhey";
        String s2 = "yebha";
        if(s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
        }
        else{
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
    }
}