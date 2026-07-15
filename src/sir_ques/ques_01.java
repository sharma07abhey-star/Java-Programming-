package sir_ques;

import java.util.Scanner;

// Prime Number Checker
public class ques_01 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        prime(num);
    }
    public static void prime(int n){
        if(n == 1){
            System.out.println("Yes");
        }
        boolean flag = true;
        for(int i = 2;i<n;i++){
            if(n%i == 0){
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
