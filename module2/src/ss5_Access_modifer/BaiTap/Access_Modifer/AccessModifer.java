package ss5_Access_modifer.BaiTap.Access_Modifer;

public class AccessModifer {
    private double radius = 1.0;
    private String color = "Red";

    public AccessModifer(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    AccessModifer(){

    }

    AccessModifer(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double GetArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
