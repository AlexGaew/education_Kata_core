//package exeption.robot;
//
//public class Test {
//    public static void main(String[] args) {
//        RobotConnectionManager robotConnectionManager = new RobotConnectionManager() {
//            @Override
//            public RobotConnection getConnection() {
//                return null;
//            }
//        };
//        moveRobot(robotConnectionManager, 10, 20);
//    }
//
//    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        for (int i = 0; i < 3; i++) {
//            RobotConnection a = null;
//            try {
//               RobotConnection a = robotConnectionManager.getConnection();
//                a.moveRobotTo(toX, toY);
//            } catch (RuntimeException e) {
//                if (a != null) {
//                    throw e;
//                }
//            } finally {
//                if (a != null) {
//                    try {
//                        a.close();
//                    } catch (RobotConnectionException e) {
//                    }
//                }
//            }
//        }
//    }
//}
