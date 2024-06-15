// StaticPolymorphismmorphism
class CompileTimePoly{
//method 1
    public int add(int x, int y){
        return x+y;
    }
}

//method 2

public int add(int x, int y, int z){
    return x+y+z;
}
// method 3
public int add(double x, int y){
    return (int)x+y;
}


// method 4
public int add(int x, double y){
    return x+(int)y;
}
 class StaticPolymorphism {
     public static void main(String[] args) {

     CompileTimePoly c1 = new CompileTimePoly();

     System.out.println(c1.add(2,4));   //method1
     System.out.println(c1.add(2,4,6));      //method 2
     System.out.println(c1.add(2, 3.4));   // method 3
     System.out.println(c1.add(2.4,4));    // method 4
 
    }
    
}
