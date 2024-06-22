package Entity;

import Cordinates.Coordinates;


public abstract class Entity {
    protected Coordinates coordinates;

    public Entity(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

}
