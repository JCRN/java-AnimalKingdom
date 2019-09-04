package animalkingdom;

public class Mammal extends AbstractAnimal {

    // Constructor
    public Mammal(String name, int yearDiscovered) {
        super(name, yearDiscovered);
    }

    // Methods
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYearDiscovered() {
        return yearDiscovered;
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String reproduce() {
        return "live births";
    }

    @Override
    public String toString() {
        return "Mammal" + "\nName: " + name + "\nYear Discovered: " + yearDiscovered;
    }
}