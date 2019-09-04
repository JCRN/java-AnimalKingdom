package animalkingdom;

public abstract class AbstractAnimal {

    // Fields:
    int yearDiscovered;
    String name;

    // Constructor:
    public AbstractAnimal(String name, int yearDiscovered) {
        // Provide uinque Id for each instance
        maxId++;
        id = maxId;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    // abstract Methods:
    public abstract String getName();

    public abstract int getYearDiscovered();

    public abstract String breathe();

    public abstract String move();

    public abstract String reproduce();

    public String eat() {
        return "All animals consume food the same way.";
    }

    public int getId() {
        return Id;
    }

}