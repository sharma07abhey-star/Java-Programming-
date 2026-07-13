package Strings;
// Most Frequent Characters  | Method - 1 | Brute Force
public class strings_15 {
    public static void main(String[] args){
        String s = "AbheeeyPrashar";
        int n = s.length();
        int maxfreq = -1;
        char ans = s.charAt(0);
        for(int i = 0;i<n;i++){
            int freq = 1;
            char ch = s.charAt(i);
            for(int j = 0;j<n;j++){
                if(s.charAt(j) == ch){
                    freq ++;
                }
            }
            if(freq > maxfreq){
                maxfreq = freq ;
                ans = ch;
            }
            else if(freq == maxfreq && ch < ans){
                ans = ch;
            }
        }
        System.out.println(ans);
    }
}
