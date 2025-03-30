package sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size = ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.print("Enter elements of the array : ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        //bubble sort
        for(int i = 0; i < n-1; i++){
            for(int j =0 ; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array : ");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
