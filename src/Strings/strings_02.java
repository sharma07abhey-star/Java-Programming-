package Strings;
// You are given a string s = "hello" print total number of consonants and vowels present in it
public class strings_02 {
    public static void main(String[] args){
        String s = "Hello Abhey";
        int vowels = 0;
        int consonants = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' ||ch =='u'){
                vowels ++;
            }else if(ch == ' '){
                continue;
            }else{
                consonants ++;
            }
        }
        System.out.println("Vowels are " + vowels);
        System.out.println("Consonants are " + consonants);
    }
}