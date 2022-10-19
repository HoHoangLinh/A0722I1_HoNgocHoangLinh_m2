package ss3_Array.ThucHanh.ThayDoiNhietDO;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cel;
        double fah;
        int choice;
        do {
            System.out.println("1. F -> C");
            System.out.println("2. C-> F");
            System.out.println("0. Exit");
            System.out.println("Enter Your Choice?");
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Nhap F?");
                    fah = scanner.nextDouble();
                    System.out.println("Do C cua ban la : " + fahtoc(fah));
                    break;
                case 2 :
                    System.out.println("Nhap C?");
                    cel = scanner.nextDouble();
                    System.out.println("Do F cua ban la : " + celtof(cel));
                    break;
            }
        }while (choice != 0);
    }




    public static double celtof(double cel){
        double fah = (9.0 /5)*cel + 32;
        return fah;
    }
    public static double fahtoc(double fah){
        double cel = (5.0 /9) * (fah - 32);
        return fah;
    }
}
