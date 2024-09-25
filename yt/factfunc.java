package yt;

import java.util.Scanner;

public class factfunc {
    public static void fact(int n){
        if(n < 0){
            System.out.println("Invalid no.");
            return;
        }
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial = factorial*i;
        }
        System.out.println("factorial = " + factorial);
        return;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        fact(n);
    }
}
