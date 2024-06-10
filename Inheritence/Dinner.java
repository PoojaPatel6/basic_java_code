package Inheritence;

class Noodle {
    String texture;
    String ingredients;

    public Noodle(String texture, String ingredients) {
        this.texture = texture;
        this.ingredients = ingredients;
    }

    public void cook() {
        System.out.println("Cooking the noodle.");
    }
}

class BiangBiang extends Noodle {
    public BiangBiang() {
        super("wide and chewy", "wheat flour");
    }

    @Override
    public void cook() {
        System.out.println("Boiling the BiangBiang noodles.");
    }
}

class Dinners {
    public void makeNoodles(Noodle noodle, String sauce) {
        noodle.cook();
        System.out.println("Mixing " + noodle.texture + " noodles made from " + noodle.ingredients + " with " + sauce + ".");
        System.out.println("Dinner is served!");
    }
}

public class Dinner {
    public static void main(String[] args) {
        Dinners noodlesDinner = new Dinners();
        Noodle biangBiang = new BiangBiang();
        noodlesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    }
}
