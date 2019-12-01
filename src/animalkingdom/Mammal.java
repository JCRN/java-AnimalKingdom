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
    public String getBreathe() {
        return "lungs";
    }

    @Override
    public String getMove() {
        return "walk";
    }

    @Override
    public String getReproduce() {
        return "live births";
    }

    @Override
    public String toString() {
        return "Mammal{" + "Name: " + name + ", Year Discovered: " + yearDiscovered + ", Breathes: " + this.getBreathe()
                + ", Eating: " + this.eat() + ", Locomotion: " + this.getMove() + ", Reproduction: "
                + this.getReproduce() + "}";
    }
}