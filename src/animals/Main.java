package animals;
import java.util.*;
public class Main
{
    public static void collection()
    {
        // name, yearNamed, id
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1658);
        Mammal raccoon = new Mammal("Racoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish parch = new Fish("Perch", 1758);
        
        List<Animal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(parch);
        System.out.println("*** List all the animals in descending order by year named ***");
        animals.sort((a1, a2) -> a1.getYearNamed() - a2.getYearNamed());
        // animals.forEach((a) -> System.out.println(a));
        System.out.println(animals);

        System.out.println("*** List all the animals alphabetically ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animals);

        System.out.println("*** List all the animals order by how they move ***");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animals);

        System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
        animals.filter((a) -> a.yearNamed() == 1758 && a.breath() == "Lungs");




    }

    public static void main(String[] args)
    {
        System.out.println("hello world!");
        collection();
    }

}
