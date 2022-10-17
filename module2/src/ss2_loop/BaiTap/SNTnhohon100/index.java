package ss2_loop.BaiTap.SNTnhohon100;

public class index {
    public static void main(String[] args) {
        int count = 0;
        int N = 2;
        while (N < 100){
            boolean flag = true;
            for (int i = 2; i < N ; i++) {
                if (N % i ==0) {
                    flag = false;
                    break;
                }
            }
                if (flag){
                    System.out.println(N);
                }
                N++;
            }
        }
    }

