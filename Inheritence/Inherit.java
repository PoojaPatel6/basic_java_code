package Inheritence;

class Noodle {
    double lengthInCentimeters;
    String shape;
    String texture = "brittle";
    
    public void cook() {
      
      this.texture = "cooked";
      
    }
  }
  class Spaghetti extends Noodle{

   
  }

  public class Inherit{
    public static void main(String[] args) {
           Spaghetti spaghettiPomodoro = new Spaghetti();
      System.out.println(spaghettiPomodoro.texture);   
    }
  }









  // class Noodle {
  //   double lengthInCentimeters;
  //   double widthInCentimeters;
  //   String shape;
  //   String ingredients;
  //   String texture = "brittle";
      
  //   Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        
  //     this.lengthInCentimeters = lenInCent;
  //     this.widthInCentimeters = wthInCent;
  //     this.shape = shp;
  //     this.ingredients = ingr;
        
  //   }
      
  //   public void cook() {
  //     this.texture = "cooked";
  //   }
      
  // }
  // class Pho extends Noodle {
  //   public Pho(){
  //      super(30.0, 0.64, "flat", "rice flour");
  //   }
  // }
  // public class Main{
  //   public static void main(String[] args) {
  //           Pho phoChay = new Pho();
  //       System.out.println(phoChay.shape);
  //   }
  // }