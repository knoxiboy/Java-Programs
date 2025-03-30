package sorting;

import java.util.Scanner;

public class quickSort {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; //pivot index
    }

    public static void QuickSort(int arr[], int low, int high){
        if(low < high){
            int pivotIdx = partition(arr, low, high);

            QuickSort(arr, low, pivotIdx-1);
            QuickSort(arr, pivotIdx+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size = ");
        int Size = sc.nextInt();

        int array[] = new int[Size];
        System.out.print("Enter array : ");
        for(int i = 0; i < Size; i++){
            array[i] = sc.nextInt();
        }

        QuickSort(array, 0, Size-1);

        for(int i = 0; i < Size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
