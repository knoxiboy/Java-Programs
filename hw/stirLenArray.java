package hw;

import java.util.Scanner;

public class stirLenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. of strings = ");
        int size = sc.nextInt();
        String[] array = new String[size];
        int len = 0;

        for(int i = 0; i < size; i++){
            System.out.print("enter string"+ i +" : ");
            array[i] = sc.next();
            len += array[i].length();
        }
        System.out.print("Total length = "+ len);
    }
}
