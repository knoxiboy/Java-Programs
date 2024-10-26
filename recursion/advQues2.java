package recursion;

import java.util.*;

public class advQues2 {
    public static int n, m;
    public static int path(int i, int j, int total){
        if(i == n-1 && j == m-1){
            return 1;
        }

        if(i == n-1){
            total += path(i, j+1, total);
        }
        else if(j == m-1){
            total += path(i+1, j, total);
        }
        else{
            total += path(i+1, j, total) + path(i, j+1, total);
        }

        return total;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Enter m : ");
        m = sc.nextInt();

        System.out.println("Total paths = "+path(0, 0, 0));
    }
}


/*

public class advQues2 {
    public static int n, m;

    public static int countPaths(int i, int j, int m, int n) {
        if(i == n || j == m){
            return 0;
        }

        if(i == n-1 && j == m-1) {
            return 1;
        }

        int downpaths = countPaths(i+1, j, m, n);

        int rightpaths = countPaths(i, j+1, m, n);

        return downpaths + rightpaths;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Enter m : ");
        m = sc.nextInt();

        System.out.println(countPaths(0, 0, m, n));
    }
}

*/

