package polymorphism;

// Class demonstrating method overloading
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}

// Main class to demonstrate method overloading
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling the overloaded methods
        System.out.println("Sum of 2 and 3: " + calc.add(5, 6));              // Outputs: 11
        System.out.println("Sum of 2, 3, and 4: " + calc.add(6, 4, 5));       // Outputs: 15
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 4.5));      // Outputs: 7.0
    }
}
