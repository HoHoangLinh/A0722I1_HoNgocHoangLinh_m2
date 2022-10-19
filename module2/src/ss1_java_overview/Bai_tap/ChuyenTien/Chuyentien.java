package ss1_java_overview.Bai_tap.ChuyenTien;

import java.util.Scanner;

public class Chuyentien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int VND = 23000;
        System.out.println("Nhap Tien USD can chuyen doi?");
        int money = sc.nextInt();
        System.out.println("Tien usd -> vnd = " + money*VND);
    }
}
