package prob;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        System.out.print("no. of rows:");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
        System.out.println();
        }
    }
}
