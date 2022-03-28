// your solution here
//fix all the errors including package errors

public class Factory {

    enum Animals {Cat, Bear, Duck}

    public Colour getAnimal(Animals animal) {
        return switch (animal) {
            case Cat -> new CAT(color);
            case Bear -> new BEAR(color);
            case Duck -> new DUCK(color);
        };
    }

    void printColour(Colour colour) {
        colour.PrintColor();
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.printColour(factory.getAnimal(Animals.Cat));
        factory.printColour(factory.getAnimal(Animals.Bear));
        factory.printColour(factory.getAnimal(Animals.Duck));
    }

}
public interface Colour {

    void PrintColor();

}

public class CAT implements Colour {

    String color;

    public CAT(String color) {
        this.color = color;
    }

    @Override
    public void PrintColor() {
        System.out.println("The cat's colour is ");
        System.out.println(color);
    }
}
