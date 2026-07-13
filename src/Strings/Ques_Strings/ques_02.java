package Strings.Ques_Strings;

import java.util.Locale;

// Palindrome check ( A given string is palindrome or not )
public class ques_02 {
    public static void main(String[] args){
        String s1 = "mam";
        String s = s1.toLowerCase().replaceAll("^a-z0-9","");
        int i = 0;
        int j = s.length() -1;
        boolean flag = true;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }
        if(flag == true){
            System.out.println( s + " is Palindrome");
        }else{
            System.out.println(s + " is not Palindrome");
        }
    }
}