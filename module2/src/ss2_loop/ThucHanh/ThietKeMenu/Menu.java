package ss2_loop.ThucHanh.ThietKeMenu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int user = -1;
        Scanner sc = new Scanner(System.in);

        while (user != 0){
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            user = sc.nextInt();
            switch (user){
                case 1 :
                    System.out.println("Triangle1");
                    System.out.println("Triangle2");
                    System.out.println("Triangle3");
                    System.out.println("Triangle4");
                    break;
                case 2 :
                    System.out.println("Square1");
                    System.out.println("Square2");
                    System.out.println("Square3");
                    System.out.println("Square4");
                    break;
                case 3 :
                    System.out.println("rectanle1");
                    System.out.println("rectanle2");
                    System.out.println("rectanle3");
                    System.out.println("rectanle4");
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("No Choice!");
            }
        }
    }
}
