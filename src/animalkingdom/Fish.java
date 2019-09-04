package animalkingdom;

public class Fish extends AbstractAnimal {

    // Constructor
    public Fish(String name, int yearDiscovered) {
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
        return "gills";
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}