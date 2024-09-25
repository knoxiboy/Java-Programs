package prob;
import java.util.Scanner;

public class advpattern3 {
    public static void main(String[] args) {
        System.out.print("n= ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){
            for(int j = 1; j < 2*n; j++){
                if(j >= i & j < n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

/*      for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
        
    }
}


