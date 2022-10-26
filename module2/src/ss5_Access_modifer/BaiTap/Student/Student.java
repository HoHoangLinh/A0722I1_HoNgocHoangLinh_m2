package ss5_Access_modifer.BaiTap.Student;

public class Student {
    private String name =  "Linh";
    private String classes = "C02";

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    Student(){

    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
