package Arrays;
// Merge Two Sorted Arrays in sorted manner
// 3 Pointers technique
public class array_23 {
    public static void main(String[] args){
        int[] a = {1,3,6,8,9} ;
        int[] b = {2,3,4,7,8,11};
        int[] c = new int[a.length + b.length];
        merge(c,a,b);
        for(int ele : c){
            System.out.print(ele + " ");
        }
    }
    public static void merge(int[] c , int[] a, int[] b){
        int i = 0 , j = 0 , k = 0 ;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k++] = a[i++]; // new way to post increment
            }
            else c[k++] = b[j++];
        }
        if(i == a.length){ // a array khatm , b ke bche hue ele lo .   1.
            while(j<b.length){
                c[k++] = b[j++];
            }
        }
        if(j == b.length){ // b array khatm , a ke bche hue ele lo .   2.
            while(i<a.length){
                c[k++] = a[i++];
            }
        }
        // Or we can just write while condition without if conditions int 1 and 2 .

//        while(i<a.length){
//            c[k++] = a[i++];
//        }
                                                // Can do this also
//        while(j<b.length){
//            c[k++] = b[j++];
//        }
    }
}
