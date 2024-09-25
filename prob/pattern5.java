package prob;
import java.util.Scanner;
/* 

public class pattern5 {
    public static void main(String[] args) {
        System.out.print("height");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for(int i = 1; i <= h; i++){
            for(int j = h; j > 0; j--){
                if(j <= i ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}

*/


public class pattern5 {
    public static void main(String[] args) {
        System.out.print("height");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for(int i = 1; i <= h; i++){

            for(int j = 1; j <= h-i; j++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}