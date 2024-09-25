package hw;

import java.util.Scanner;

public class eveoddfunc {
    public static void evenodd(int n){
        if(n%2 ==  0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("no. = ");
        int n = sc.nextInt();

        evenodd(n);
    }
}
