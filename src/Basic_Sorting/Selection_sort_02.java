package Basic_Sorting;

// Selection sort arrange in descending order

public class Selection_sort_02 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 6, -2, 1, 9};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int maxvalue = Integer.MIN_VALUE;
            int mindex = -1;
            for(int j = i;j<n;j++){
                if(arr[j] > maxvalue){
                    maxvalue = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = maxvalue;
            arr[mindex] = temp;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
