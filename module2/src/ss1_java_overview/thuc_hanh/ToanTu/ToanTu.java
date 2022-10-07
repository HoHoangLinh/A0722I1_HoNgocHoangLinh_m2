package ss1_java_overview.thuc_hanh.ToanTu;

import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        float ChieuCao;
        float ChieuRong;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Chieu Cao :");
        ChieuCao = sc.nextFloat();
        System.out.println("Nhap Chieu Rong :");
        ChieuRong = sc.nextFloat();
        float result = ChieuCao * ChieuRong;
        System.out.println("Dien Tich Hinh Chu Nhat La :" + result);
    }
}
