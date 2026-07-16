package Binary_Search;
import java.util.Scanner;
// sqrt using binary search // 69 LC
public class binary_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = sqrt(n);
        System.out.println(result);
    }
    public static int sqrt(int x){
        long lo = 0;
        long hi = x;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            if( mid * mid == x ) return (int) mid;
            else if(mid * mid > x) hi = mid-1;
            else lo = mid + 1;
        }
        return (int) hi;
    }
}
