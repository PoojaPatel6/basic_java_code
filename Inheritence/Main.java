package Inheritence;

 class Noodle {     //public
    @SuppressWarnings("unused")
    private double lengthInCentimeters;
    @SuppressWarnings("unused")
    private double widthInCentimeters;
    @SuppressWarnings("unused")
    private String shape;
    protected String ingredients;
    protected String texture = "brittle";
    
    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }
    
    public final boolean isTasty() {
        return true;
    }
}

 class Ramen extends Noodle {     //public
    Ramen() {
        super(30.0, 0.3, "flat", "wheat flour");
    }
}

public class Main {
    public static void main(String[] args) {
        Ramen yasaiRamen = new Ramen();
        //System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty());
    }
}
