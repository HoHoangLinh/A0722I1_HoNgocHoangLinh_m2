package ss5_Access_modifer.ThucHanh.Static_method;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int a , String b){
        rollno = a;
        name = b;
    }

    static void change(){
        college = "HoangLinh";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
