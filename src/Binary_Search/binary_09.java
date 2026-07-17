package Binary_Search;
// Arranging Coins LC 441
public class binary_09 {
    public static void main(String[] args){
        int n = 8;
        int result = arrangeCoins(n);
        System.out.println(result);
    }
    public static int arrangeCoins(int n) {
        long lo = 0;
        long hi = n;
        long ans = 0;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            long m = mid * (mid +1)/2;
            if(m ==n) return (int)mid;
            else if(m>n){
                hi = mid -1;
            }
            else{
                ans = mid ;
                lo = mid + 1;
            }
        }
        return (int)(ans);
    }
}
