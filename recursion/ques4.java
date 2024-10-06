package recursion;

import java.util.*;

public class ques4 {
    public static void checkSorted(int idx, int n, int[] array) {
        if(idx == n-1){
            System.out.println("Sorted");
            return;
        }

        if(array[idx] > array[idx+1]){
            System.out.println("Not sorted");
            return;
        }

        checkSorted(idx+1, n, array);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int n = sc.nextInt();
        int array[] = new int[n];

        System.out.print("Enter elements of the array : ");
        for(int i = 0; i < n; i++ ){
            array[i] = sc.nextInt();
        }

        int idx = 0;
        checkSorted(idx, n, array);
    }
}
