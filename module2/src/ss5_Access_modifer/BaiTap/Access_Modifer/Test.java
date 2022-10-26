package ss5_Access_modifer.BaiTap.Access_Modifer;

public class Test {
    public static void main(String[] args) {
        AccessModifer accessModifer = new AccessModifer();
        System.out.println(accessModifer.getRadius());
        System.out.println(accessModifer.GetArea());

        AccessModifer accessModifer1 = new AccessModifer(10);
        System.out.println(accessModifer1.getRadius());
        System.out.println(accessModifer1.GetArea());
    }
}
