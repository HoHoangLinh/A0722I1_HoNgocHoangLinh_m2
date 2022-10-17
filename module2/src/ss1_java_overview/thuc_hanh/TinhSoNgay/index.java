package ss1_java_overview.thuc_hanh.TinhSoNgay;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println("Nhap Thang?");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String Day;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Day = "31 Ngay";
                break;
            case 2:
                Day = "28 va 29 Ngay";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Day = "30 Ngay";
                break;
            default:
                Day = "Error";
                break;
        }
        if (month <= 12) {
            System.out.println("Thang " + month + " Co " + Day);
        } else {
            System.out.println(Day);
        }
    }
}
