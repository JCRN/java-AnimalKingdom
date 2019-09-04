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
    public String getBreathe() {
        return "lungs";
    }

    @Override
    public String getMove() {
        return "fly";
    }

    @Override
    public String getReproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "Bird{" + "Name: " + name + ", Year Discovered: " + yearDiscovered + ", Breathes: " + this.getBreathe()
                + ", Eating: " + this.eat() + ", Locomotion: " + this.getMove() + ", Reproduction: "
                + this.getReproduce() + "}";
    }
}