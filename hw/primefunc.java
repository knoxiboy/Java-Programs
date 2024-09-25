package hw;

import java.util.Scanner;

public class primefunc {
    public static int prime(int n){
        int count = 0;
        if(n > 0){
            for(int i = 1; i <= n; i++){
                if(n%i == 0){
                    count = count + 1;
                }
            }
        }
        else{
            System.out.println("enter a +ve no.");
            return 0;
        }
        if(count > 2){
            System.out.println("not a prime no.");
            return 0;
        }
        else{
            System.out.println("prime no.");
            return 0;
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. = ");
        int n = sc.nextInt();

        prime(n);
    } 
}
