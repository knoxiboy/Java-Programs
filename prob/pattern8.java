package prob;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        System.out.print("no. of rows: ");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int p = 0;

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= i; j++){
                p = p+1;
                System.out.print(p+" ");
            }
        System.out.println();
        }
    }
}
