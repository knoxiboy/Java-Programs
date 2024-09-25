package exercise1;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;

        int x;

        do{
            System.out.print("enter no. : ");
            int n = sc.nextInt();

            if(n > 0){
                positive ++;
            }
            else if(n < 0){
                negative ++;
            }
            else{
                zero ++;
            }

            System.out.print("Press 1 to continue : ");
            x = sc.nextInt();
        }while(x == 1);

        System.out.println("Count of +ve no. = "+ positive);
        System.out.println("Count of -ve no. = "+ negative);
        System.out.println("Count of zero's = "+ zero);
    }
}
