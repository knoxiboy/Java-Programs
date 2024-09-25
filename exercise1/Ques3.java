package exercise1;

import java.util.Scanner;

public class Ques3 {
    public static void greatest(int a, int b){
        if(a > b){
            System.out.println(a +" is greater than "+ b);
        }
        else if(b > a){
            System.out.println(b +" is greater than "+ a);
        }
        else{
            System.out.println("Both are equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        greatest(a, b);
    }
}
