package Strings;
// You are given a string s , print YES if it is a palindrome
// or NO otherwise
public class strings_06 {
    public static void main(String[] args){
        String s = "naman";
        int i = 0;
        int j = s.length() - 1;
        boolean palindrome = true;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i ++;
                j-- ;
                palindrome = true;
            }else {
                palindrome = false;
                break;
            }
        }
        if(palindrome == true){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}