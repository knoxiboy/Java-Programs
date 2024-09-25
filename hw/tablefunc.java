package hw;

import java.util.Scanner;

public class tablefunc {
    public static void table(int n){
        for(int i = 1; i <= 10; i++){
            System.out.print((n*i)+" ");
        }
    }
     public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. = ");
        int n = sc.nextInt();

        table(n);
    }
}
