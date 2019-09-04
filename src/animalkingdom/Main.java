package animalkingdom;

import java.util.*;

public class Main {

    // Methods
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println(a.getName());
            }
        }
    }

    public static void main(String[] args) {
        // Instantiate classes

        // Mammals:
        Mammal panda = new Mammal("Panda", 1869);
        System.out.println("Method Test Panda Info: " + "\nID: " + panda.getId() + "\nName: " + panda.getName()
                + "\nYear Discovered: " + panda.getYearDiscovered());
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Birds:
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        System.out.println("Method Test Peacock Info: " + "\nID: " + peacock.getId() + "\nName: " + peacock.getName()
                + "\nYear Discovered: " + peacock.getYearDiscovered() + "\nReproduction: " + peacock.getReproduce());
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Fish:
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // Create / populate ArrayList<AbstractAnimal>
        ArrayList<AbstractAnimal> animalsList = new ArrayList<AbstractAnimal>();
        animalsList.add(panda);
        animalsList.add(zebra);
        animalsList.add(koala);
        animalsList.add(sloth);
        animalsList.add(armadillo);
        animalsList.add(raccoon);
        animalsList.add(bigfoot);
        animalsList.add(pigeon);
        animalsList.add(peacock);
        animalsList.add(toucan);
        animalsList.add(parrot);
        animalsList.add(swan);
        animalsList.add(salmon);
        animalsList.add(catfish);
        animalsList.add(perch);

        // Use Lambda expressions to sort animalsList
        System.out.println("******** SORTS *********");
        System.out.println("\n\n*** Animals sorted in descending order by year discovered");
        animalsList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
        animalsList.forEach((a) -> System.out.println(a));

        System.out.println("\n*** Animals sorted alphabetically");
        animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalsList.forEach((a) -> System.out.println(a));

        System.out.println("\n*** Animals sorted by how they move");
        animalsList.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
        animalsList.forEach((a) -> System.out.println(a));

        System.out.println("******** FILTERS *********");
        System.out.println("\n\n*** Animals soted by only those that have lungs");
        printAnimals(animalsList, a -> a.getBreathe() == "lungs");

    }
}