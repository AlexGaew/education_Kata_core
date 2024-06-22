package Entity;

import Cordinates.Coordinates;
import Cordinates.Map;

public class Herbivore extends Creature {


    public Herbivore(Coordinates coordinates) {
        super(coordinates, 3, 100);
    }

    @Override
    public void makeMove(Map map, Entity entity, Coordinates coordinates) {

    }


    @Override
    public void eating() {
        System.out.println("Herbivore EATING");

    }

    @Override
    public String toString() {
        return "I'm a Entity.Herbivore, my health" + getHealth();
    }
}
