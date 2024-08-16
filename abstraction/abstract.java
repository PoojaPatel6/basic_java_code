// Abstract class
abstract class Animal {
  
    abstract void sound();

    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}


class Dog extends Animal {
   
    void sound() {
        System.out.println("The dog says: Woof Woof");
    }
}

class Cat extends Animal {
 
    void sound() {
        System.out.println("The cat says: Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Dog and Cat classes
        Dog dog = new Dog();
        Cat cat = new Cat();

       
        dog.sound();  
        cat.sound(); 

        dog.sleep();  
        cat.sleep(); 
    }
}
