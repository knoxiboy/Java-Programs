package prob;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("n:");
        int n = sc.nextInt();
        System.out.print("m:");
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++ ){
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
            //or System.out.print("\n");
        }
    }
}
