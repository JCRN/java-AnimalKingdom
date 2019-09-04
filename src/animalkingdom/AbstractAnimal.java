package animalkingdom;

public abstract class AbstractAnimal {
    // Fields
    int food;

    // Constructors
    public AbstractAnimal(int food) {
        this.food = food;
    }

    public AbstractAnimal() {
        food = 1;
    }

}