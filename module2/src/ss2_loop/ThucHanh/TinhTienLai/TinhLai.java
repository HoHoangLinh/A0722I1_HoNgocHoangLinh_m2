package ss2_loop.ThucHanh.TinhTienLai;

import java.util.Scanner;

public class TinhLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thang muon gui?");
        int month = scanner.nextInt();
        System.out.println("Nhap so tien?");
        double money = scanner.nextDouble();
        System.out.println("Nhap Lai");
        double lai = scanner.nextDouble();
        double Str = 0;
        for (int i = 0 ; i < month ; i++){
            Str += money * (lai/100)/12 * month;
        }
        System.out.println("Tong so tien la " + Str);
    }
}
