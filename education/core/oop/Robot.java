package oop;
public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void turnLeft() {
        direction = Direction.LEFT;
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        direction = Direction.RIGHT;
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        if (direction == Direction.UP) {
            this.y += 1;
        } else if (direction == Direction.RIGHT) {
            this.x += 1;
        } else if (direction == Direction.LEFT) {
            this.x -= 1;
        } else if (direction == Direction.DOWN) {
            this.y -= 1;
        }


        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }
        if (robot.getX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

    }

    @Override
    public String toString() {
        return "Робот находися на поле с координатами: X: " + this.x + ", Y: " + this.y + ", Смотрит: " + this.direction;
    }


}
