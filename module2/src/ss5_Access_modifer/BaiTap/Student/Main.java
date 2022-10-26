package ss5_Access_modifer.BaiTap.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getClasses() + " " + student.getName());
        student.setName("Hoa");
        student.setClasses("C03");
        System.out.println(student.getClasses() + " " + student.getName());
    }
}
