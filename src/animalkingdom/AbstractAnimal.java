package animalkingdom;

public abstract class AbstractAnimal {

    // Fields:
    int id;
    int maxId = 0;
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

    public abstract String getBreathe();

    public abstract String getMove();

    public abstract String getReproduce();

    public String eat() {
        return "Same for each";
    }

    public int getId() {
        return id;
    }

}