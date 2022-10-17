package ss2_loop.ThucHanh.CheckSNT;

import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 SNT");
        int num = sc.nextInt();

        if (num < 2 ){
            System.out.println("Khong Phai la SNT");
        } else {
            int i = 2;
            boolean flag = true;
            while (i < num){
                if (num % i == 0) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag){
                System.out.println("Day la SNT");
            } else {
                System.out.println("Khong Phai la snt");
            }
        }
    }
}
