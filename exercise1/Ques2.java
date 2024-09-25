package exercise1;

import java.util.Scanner;

public class Ques2 {
    public static void oddSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println("Sum of ood no. = "+ sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        oddSum(n);
    }
}
