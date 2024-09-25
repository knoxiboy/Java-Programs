package hw;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.print("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                count = count + 1;
            }
        }

        if(count == 2){
            System.out.println("prime no.");
        }
        else{
            System.out.println("not a prime no.");
        }
    }
}
