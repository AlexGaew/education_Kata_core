package Entity;
import Cordinates.Coordinates;
import Cordinates.Map;


public abstract class Creature extends Entity {

    protected int speed;
    protected int health;

    public Creature(Coordinates coordinates, int speed, int health) {
        super(coordinates);
        this.speed = speed;
        this.health = health;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void makeMove(Map map, Entity entity, Coordinates coordinates);
    public abstract void eating();
}
