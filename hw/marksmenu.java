package hw;
import java.util.Scanner;

public class marksmenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("marks = ");       
            int marks = sc.nextInt();
            if(marks >= 90 & marks <=100){
                System.out.println("This is good");
            }
            else if(marks >= 60 & marks <= 89){
                System.out.println("This is also good");
            }
            else if(marks >= 0 & marks <= 59){
                System.out.println("This is good as well");
            }
            else{
                System.out.println("Plz enter marks btw 0 to 100....");
            }
            System.out.println("Because marks don’t matter but our effort does");
            System.out.print("1 or 0 ?  ");
            int x = sc.nextInt();
            n=x;
        }while(n == 1);
    }
}
