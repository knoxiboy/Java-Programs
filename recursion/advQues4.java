package recursion;

import java.util.Scanner;

public class advQues4 {
    public static int call(int n){
        if(n <= 1){
            return 1;
        }

        int single = call(n-1);

        int pair = (n-1)*call(n-2);

        return single + pair;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Total ways = "+ call(n));
    }
}

