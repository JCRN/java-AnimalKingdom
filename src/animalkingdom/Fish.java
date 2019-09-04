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
    public String getBreathe() {
        return "gills";
    }

    @Override
    public String getMove() {
        return "swim";
    }

    @Override
    public String getReproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "Fish{" + "Name: " + name + ", Year Discovered: " + yearDiscovered + ", Breathes: " + this.getBreathe()
                + ", Eating: " + this.eat() + ", Locomotion: " + this.getMove() + ", Reproduction: "
                + this.getReproduce() + "}";
    }
}