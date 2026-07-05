package Arrays;
// Two Sum using nested loop
public class array_12 {
    public static void main(String[] args){
        int[] arr = {0,11,3,1,-5,4};
        int n = arr.length;
        int target = 12;
        for(int i = 0;i< n;i++){
            for(int j = i+1;j< n;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}