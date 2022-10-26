package ss5_Access_modifer.ThucHanh.Static_method;

public class Test {
    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod Static1 = new StaticMethod(123,"Ho");
        StaticMethod Static2 = new StaticMethod(456,"Hoang");
        StaticMethod Static3 = new StaticMethod(789,"Linh");

        Static1.display();
        Static2.display();
        Static3.display();
    }
}
