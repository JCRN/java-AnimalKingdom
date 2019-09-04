package animalkingdom;

public class Mammals extends AbstractAnimal {

    // Constructor
    public Mammals(String name, int yearDiscovered) {
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
}