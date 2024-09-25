package sorting;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size = ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter elements of the array : ");
            array[i] = sc.nextInt();
        }

        //insertion sort
        for(int i = 1; i < n; i++){
            int current = array[i];
            int j = i-1;
            while(j >= 0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        System.out.print("Sorted array : ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
