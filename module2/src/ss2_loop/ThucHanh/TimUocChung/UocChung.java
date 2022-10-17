package ss2_loop.ThucHanh.TimUocChung;

import java.util.Scanner;

public class UocChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A?");
        int a = sc.nextInt();
        System.out.println("B?");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b){
            if (a > b ){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("result = " + a+ "\n" + b);
    }
}
