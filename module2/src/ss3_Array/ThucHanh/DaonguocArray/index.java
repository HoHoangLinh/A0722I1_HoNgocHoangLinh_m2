package ss3_Array.ThucHanh.DaonguocArray;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] array;
        int i = 0;
        do {
            System.out.println("Enter your size?");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("pls nho hon 20");
            }
        }while (size > 20);
        array = new int[size];

        while (i < array.length){
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        for (int j = 0; j < array.length ; j++) {
            System.out.println(array[j] + ",");

        }
        for (int j = 0; j < array.length / 2 ; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 -j] = temp;

        }

        for (int j = 0; j < array.length ; j++) {
            System.out.print(array[j] + ",");

        }
    }
}
