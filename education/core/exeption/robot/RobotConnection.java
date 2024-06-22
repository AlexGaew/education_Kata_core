package exeption.robot;

import  java.io.File;
import  java.nio.file.Path;

public interface RobotConnection extends AutoCloseable {

    void moveRobotTo(int x, int y);

    @Override
    void close();
}
