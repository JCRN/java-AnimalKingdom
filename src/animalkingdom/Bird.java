package animalkingdom;

public class Bird extends AbstractAnimal {

    // Constructor
    public Bird(String name, int yearDiscovered) {
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
        return "fly";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "Bird" + "\nName: " + name + "\nYear Discovered: " + yearDiscovered;
    }
}