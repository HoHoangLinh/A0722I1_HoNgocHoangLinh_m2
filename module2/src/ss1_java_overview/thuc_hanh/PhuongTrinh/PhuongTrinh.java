package ss1_java_overview.thuc_hanh.PhuongTrinh;

import java.util.Scanner;

public class PhuongTrinh {
    public static void main(String[] args) {
        System.out.println("Vui long nhap vao a * x + b = 0 ");
        Scanner sc = new Scanner(System.in);

        System.out.println("a : ");
        double a = sc.nextDouble();

        System.out.println("b : ");
        double b = sc.nextDouble();

        System.out.println("c : ");
        double c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("x = %f",answer);
        }else {
            if (b == c){
                System.out.println("all X!");
            }else {
                System.out.println("Vo Nghiem!");
            }
        }
    }
}
