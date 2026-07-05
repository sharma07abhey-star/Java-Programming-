package Arrays;
// Wave Array
public class array_19 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        for(int i = 0;i<arr.length-1;i+=2){
            if(i == arr.length) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
