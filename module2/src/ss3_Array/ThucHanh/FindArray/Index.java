package ss3_Array.ThucHanh.FindArray;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        String[] array = {"Linh","Hao","Tuan","Huy"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name ?");
        String user = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < array.length ; i++) {
            if (array[i].equals(user)){
                System.out.println("Ten " + user + " nam o vi tri " + (i +1));
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Ten " + user + " Khong co trong danh sach");
        }
    }
}
