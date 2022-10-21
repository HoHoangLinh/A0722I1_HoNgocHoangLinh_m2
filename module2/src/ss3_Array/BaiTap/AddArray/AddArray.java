package ss3_Array.BaiTap.AddArray;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap index can chen");
        int in = sc.nextInt();
        System.out.println("Nhap so can chen?");
        int num = sc.nextInt();

        int[] arr = {1,2,4,5,6,7,8};
        int index = 0;

        for (int i = in; i < arr.length -1 ; i++) {
            arr[in] = arr[in +1];
        }

        for (int i = 0; i < arr.length ; i++) {
            arr[in] = num;
        }

        for (int i : arr) {
            System.out.print(arr[i] + "\t");
        }
    }
}
