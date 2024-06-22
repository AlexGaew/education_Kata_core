package Entity;


import Cordinates.Coordinates;
import Cordinates.Map;


public class Predator extends Creature {


    public Predator(Coordinates coordinates, int speed, int health) {
        super(coordinates, speed, health);
    }

    @Override
    public void makeMove(Map map, Entity predator, Coordinates coordinates) {
        int i = 0;
        label:
        while (i == getSpeed()) {
            Entity entity = map.getNextEntity(coordinates);
            if (entity != null) {
                switch (entity.getClass().getSimpleName()) {
                    case "Herbivore":
                        move(map, predator, coordinates);
                        this.eating();
                        break;
                    case "Predator":
                        if (0 <= coordinates.getHorizontal() && coordinates.getHorizontal() <= 7 && 0 <= coordinates.getVertical() && coordinates.getVertical() <= 7) {
                            fight(predator, entity, map, coordinates);
                        }
                        break label;
                    case "Rock":
                        maneuver(map, coordinates);
                        break label;
                }
            } else {
                decreaseLife(map, coordinates);
                move(map, predator, coordinates);

                if (!isALive()) {
                    map.deleteEntities(coordinates);
                    System.out.println("Predator is dead!");

                }

            }
            i++;
        }
    }

    public void move(Map map, Entity predator, Coordinates coordinates) {
        if (coordinates.getHorizontal() != 7) {
            map.moveEntities(coordinates, new Coordinates(coordinates.getVertical(), coordinates.getHorizontal() + 1));

        } else if (coordinates.getVertical() == 7) {
            map.moveEntities(coordinates, new Coordinates(coordinates.getVertical() - 7, coordinates.getHorizontal() - 7));
        } else {
            map.moveEntities(coordinates, new Coordinates(coordinates.getVertical() + 1, coordinates.getHorizontal() - 7));
        }
    }

    public void maneuver(Map map, Coordinates coordinates) {
        Entity entityNetx = map.getEntity(new Coordinates(coordinates.getVertical() + 1, coordinates.getHorizontal()));
        Entity entityCurrent = map.getEntity(new Coordinates(coordinates.getVertical(), coordinates.getHorizontal()));
        if (entityNetx != null) {
            switch (entityNetx.getClass().getSimpleName()) {
                case "Herbivore" -> {
                    this.eating();
                    map.moveEntities(coordinates, new Coordinates(coordinates.getVertical() + 1, coordinates.getHorizontal()));
                }
                case "Predator" -> {
                    decreaseLife(map, coordinates);
                    fight(entityCurrent, entityNetx, map, coordinates);
                    map.moveEntities(coordinates, new Coordinates(coordinates.getVertical(), coordinates.getHorizontal() - 1));
                }
                case "Rock" -> decreaseLife(map, coordinates);
                default -> {
                    decreaseLife(map, coordinates);
                    map.moveEntities(coordinates, new Coordinates(coordinates.getVertical() + 1, coordinates.getHorizontal()));
                }
            }


        }


    }

    private void fight(Entity entityCurrent, Entity entityNetx, Map map, Coordinates coordinates) {
        Predator predatorNext = (Predator) entityNetx;
        Predator predatorCurrent = (Predator) entityCurrent;
        if (predatorCurrent.getHealth() == predatorNext.getHealth()) {
            map.deleteEntities(coordinates);
            map.deleteEntities(new Coordinates(coordinates.getVertical() + 1, coordinates.getHorizontal()));
        } else if (predatorCurrent.getHealth() < predatorNext.getHealth()) {
            predatorCurrent.setHealth(predatorCurrent.getHealth() - predatorNext.getHealth());
            if (predatorCurrent.getHealth() <= 0) {
                map.deleteEntities(coordinates);
            }
            predatorNext.setHealth(predatorNext.getHealth() - predatorCurrent.getHealth());
        }
    }


    public void decreaseLife(Map map, Coordinates coordinates) {
        Predator pred = (Predator) map.getEntity(coordinates);
        pred.health = -10;
    }

    public void inCeaseLife() {

        if (this.getHealth() >= 99) {
            System.out.println("Health Predator is full!!!");
            this.setHealth(99);
        } else this.setHealth(getHealth() + 10);
    }

    public boolean isALive() {
        return getHealth() > 5;
    }


    @Override
    public void eating() {
        this.inCeaseLife();
        System.out.println("Predator eating Herbivore");
    }

    @Override
    public String toString() {
        return "\"I am Entity.Predator\" my life is " + getHealth();
    }
}
