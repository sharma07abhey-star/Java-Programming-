package Strings;
import java.lang.reflect.Array;
import java.util.Arrays;
// Most Frequent Characters  | Method - 2 | , Sorting , Sliding Window Technique
public class strings_16 {
    public static void main(String[] args){
        String s = "AbheyPrashar".toLowerCase();
        int n = s.length();
        int maxfreq = -1;
        char ans = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i = 0;
        int j = 0;
        while(j<n){
            if(arr[i] == arr[j]){
                j++;
            }else{
                int freq = j-i;
                if(freq > maxfreq){
                    maxfreq = freq;
                    ans = arr[i];
                }
                i = j;
            }
        }
        int freq = j-i;
        if(freq > maxfreq){
            maxfreq = freq;
            ans = arr[i];
        }
        System.out.println(ans);
    }
}