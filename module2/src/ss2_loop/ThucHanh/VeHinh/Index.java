package ss2_loop.ThucHanh.VeHinh;

public class Index {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
    }
}