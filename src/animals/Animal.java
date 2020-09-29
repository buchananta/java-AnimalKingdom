package animals;

import java.util.*;
abstract class Animal
{
    protected int yearNamed;
    protected String name;
    protected int id;
    protected List<String> stomach = new ArrayList<>();
    private int maxId = 0;

    public Animal(String name, int yearNamed)
    {
       this.name = name;
       this.yearNamed = yearNamed;
       this.id = maxId++;
    }

    public void eat(String food)
    {
        stomach.add(food);
    }
    // abstract methods
    abstract String move();
    abstract String breath();
    abstract String reproduce();

}
