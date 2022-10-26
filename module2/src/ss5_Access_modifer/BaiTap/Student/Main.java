package ss5_Access_modifer.BaiTap.Student;

public class Main {
    void method(int x, int y) {
        x = 5;
        y = 5;
    }

    public static void main(String[] args) {
        Main o = new Main();
        int x = 1, y = 1;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
}
