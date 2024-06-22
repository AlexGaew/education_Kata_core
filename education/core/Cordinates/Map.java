package Cordinates;

import Entity.*;

import java.util.HashMap;
import java.util.Random;

public class Map {
    private HashMap<Coordinates, Entity> entityes = new HashMap<>();


    public void setEntityes(Coordinates coordinates, Entity entity) {
        entityes.put(coordinates, entity);
    }


    public Entity getNextEntity(Coordinates coordinates) {
        int x = coordinates.getHorizontal();
        int y = coordinates.getVertical();
        if (x != 7) {
            x += 1;
        } else if (y == 7) {
            y = 0;
        } else {
            y += 1;
            x = 0;
        }

        return entityes.get(new Coordinates(x, y));
    }


    public void deleteEntities(Coordinates coordinates) {
        entityes.remove(coordinates);
    }

    public void moveEntities(Coordinates from, Coordinates to) {
        Entity entity = getEntity(from);

        deleteEntities(from);
        setEntityes(to, entity);
    }

    public Entity getEntity(Coordinates coordinates) {
        return entityes.get(coordinates);
    }


    public boolean isEmptyNextCels(Coordinates coordinates) {
        return !entityes.containsKey(coordinates);
    }

    public boolean isEmptyCels(Coordinates coordinates) {
        return entityes.containsKey(coordinates);
    }


    public void setupEntityesToMap() {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {

                int forCordinateHor = random.nextInt(0, 10);
                int forCordinateVer = random.nextInt(0, 10);
                int randomNum = random.nextInt(0,50);

                if (0 < randomNum & randomNum <= 10) {
                    setEntityes(new Coordinates(forCordinateVer, forCordinateHor), new Predator(new Coordinates(forCordinateVer, forCordinateHor), 3, 100));
                }

                if (10 < randomNum & randomNum <= 20) {
                    setEntityes(new Coordinates(forCordinateVer, forCordinateHor), new Herbivore(new Coordinates(forCordinateVer, forCordinateHor)));
                }
                if (20 < randomNum & randomNum <= 30) {
                    setEntityes(new Coordinates(forCordinateVer, forCordinateHor), new Grass(new Coordinates(forCordinateVer, forCordinateHor)));
                }
                if (30 < randomNum & randomNum <= 45) {
                    setEntityes(new Coordinates(forCordinateVer, forCordinateHor), new Tree(new Coordinates(forCordinateVer, forCordinateHor)));
                }
                if (45 < randomNum & randomNum <= 50) {
                    setEntityes(new Coordinates(forCordinateVer, forCordinateHor), new Rock(new Coordinates(forCordinateVer, forCordinateHor)));
                }

            }

    }


}


