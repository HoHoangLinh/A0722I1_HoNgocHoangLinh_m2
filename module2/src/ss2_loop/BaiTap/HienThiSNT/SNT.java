package ss2_loop.BaiTap.HienThiSNT;

public class SNT {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (count < 20){
            boolean flag = true;
            for (int i = 2; i < N; i++) {
                if(N % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
                System.out.println(N);
            }
            N++;
        }
    }
}
