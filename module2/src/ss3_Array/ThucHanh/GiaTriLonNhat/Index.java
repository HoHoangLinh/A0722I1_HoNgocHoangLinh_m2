package ss3_Array.ThucHanh.GiaTriLonNhat;


public class Index {
    public static void main(String[] args) {
        int[] array = {1,3,5,11,7,9};
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("So lon nhat trong array la : " + max + "\n vi tri o " + index);
    }
}
