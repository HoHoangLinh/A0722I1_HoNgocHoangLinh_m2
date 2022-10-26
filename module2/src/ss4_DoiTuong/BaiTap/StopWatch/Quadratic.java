package ss4_DoiTuong.BaiTap.StopWatch;

import java.util.Scanner;

public class Quadratic {
    private double a;
    private double b;
    private double c;

    public Quadratic ( double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double CongThuc() {
        return this.b*2-4*this.a*this.c;
    }

    public double get1(){
        return (-this.b+Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
    }

    public double get2(){
        return (-this.b-Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/2*this.a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap A");
        double A = sc.nextDouble();
        System.out.println("Nhap B");
        double B = sc.nextDouble();
        System.out.println("Nhap C");
        double C = sc.nextDouble();

        Quadratic equation = new Quadratic(A,B,C);
        if (equation.CongThuc() >0 ){
            System.out.println(equation.get1() + " and " + equation.get2());
        }  else if (equation.CongThuc() == 0) {
            System.out.println("The equation has ones root " + equation.get1());
        }else {
            System.out.println("The equation has not roots ");
        }
    }
}

