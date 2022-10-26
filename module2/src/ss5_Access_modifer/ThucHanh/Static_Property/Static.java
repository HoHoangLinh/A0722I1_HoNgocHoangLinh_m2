package ss5_Access_modifer.ThucHanh.Static_Property;

public class Static {
    private String name;
    private String engine;

    public static int NumCar;

    public Static(String a , String b){
        this.name = a;
        this.engine = b;
        NumCar++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public static int getNumCar() {
        return NumCar;
    }
    void Display(){
        System.out.println(NumCar+ " " + name + " " + engine);
    }
}
