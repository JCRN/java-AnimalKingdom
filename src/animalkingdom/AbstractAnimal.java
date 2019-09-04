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

}