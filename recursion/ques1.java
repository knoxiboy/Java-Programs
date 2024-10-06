package recursion;

import java.util.Scanner;

public class ques1 {
    public static void towerOfHanoi(int n, String S, String H, String D) {

        if(n == 1){
            System.out.println("transfer disk "+ n +" from "+ S +" to "+ D);
            return;
        }

        towerOfHanoi(n-1, S, D, H);

        System.out.println("transfer disk "+ n +" from "+ S +" to "+ D);

        towerOfHanoi(n-1, H, S, D);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of disk : ");
        int n = sc.nextInt();

        towerOfHanoi(n, "S" ,"H" , "D");

    }
}
