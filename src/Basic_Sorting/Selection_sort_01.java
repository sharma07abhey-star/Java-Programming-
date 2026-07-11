package Basic_Sorting;

// Selection Sort arrange in ascending order

public class Selection_sort_01 {
    public static void main(String[] args){
        int[] arr = {8,4,1,9,-3,6,5};
        for(int i = 0;i<arr.length;i++){
            int minvalue = Integer.MAX_VALUE;
            int mindex = -1;
            for(int j = i;j<arr.length;j++){
                if(arr[j] < minvalue){
                    minvalue = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
