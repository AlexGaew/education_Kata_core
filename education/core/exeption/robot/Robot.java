package exeption.robot;

public class Robot implements RobotConnection, RobotConnectionManager {
    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {

    }

    @Override
    public RobotConnection getConnection() {
        return new Robot();
    }
}
