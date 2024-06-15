//Dynamic polymorphis,

class Vehicle{
    public void move(){
        System.out.println("Vehicle Can Move:");

    }
}
class Bike extends Vehicle{
    public void move(){

        System.out.println("Bike can move: ");
    }

}


public class RuntimePolyMain {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        v1.move();
        v1 = new Vehicle();
        v1.move();
    }
    
}
