package exercise1;

import java.util.Scanner;

public class Ques1 {
    public static void avg(int a, int b, int c){
        float avg = (a+b+c)/3;
        System.out.println("average = "+ avg);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        
        avg(a,b,c);
    }
}
