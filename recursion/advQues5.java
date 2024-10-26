package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class advQues5 {
    public static void printSubsets(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset) {
        if(n == 0) {
            printSubsets(subset);
            return;
        }

        findSubsets(n-1, subset);
        subset.add(n);

        findSubsets(n-1, subset);
        subset.remove(subset.size() - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.print("Subsets are : ");
        findSubsets(n, new ArrayList<Integer> ());
    }
}
