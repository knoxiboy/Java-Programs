package sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size = ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.print("Enter elements of the array : ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        //Selection Sort
        for(int i = 0; i < n-1; i++){
            int s = i;
            for(int j = i+1; j < n; j++){
                if(array[s] > array[j]){
                    s = j;
                }
            }
            //swap
            int temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }

        System.out.print("Sorted array : ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
