package ss3_Array.BaiTap.XoaArray;

import java.util.Scanner;

public class XoaArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("Nhap so can xoa'?");
        int user = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (user == arr[i]){ ;
                index = i ;
            }
        }
        System.out.println( "vi tri la " + index);
        for (; index < arr.length - 1 ; index++) {
            arr[index] = arr[index + 1];
        }
        arr[4] = 0;

        for (int i : arr) {
            System.out.print(i + " " + " \t");
        }
    }
}
