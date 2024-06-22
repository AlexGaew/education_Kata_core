import Cordinates.*;

import java.util.Random;

import Entity.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map map = new Map();
        map.setupEntityesToMap();
        MapRender mapRender = new MapRender();
        Action action = new Action(map,  mapRender);
        mapRender.renderMap(map);
        action.actionSimulation();

        //
        //


//        for (int i = 0; i < Horizontal.horizontal.length; i++) {
//            int forCordinateHor = random.nextInt(Horizontal.horizontal.length);
//            int forCordinateHorVer = random.nextInt(Horizontal.horizontal.length);
//            Main.action(Main.sistemCommand(), map.getEntity(new Coordinates(Horizontal.horizontal[forCordinateHor], Vertical.vertical[forCordinateHorVer])));
//        }
    }


    static int[][] sistemCommand() {
        Random random = new Random();
        int[][] arrayCommand = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arrayCommand[i][j] = random.nextInt(64);
            }

        }
        return arrayCommand;
    }

    static void action(int[][] arrayCommand, Entity creature) {
        for (int[] ints : arrayCommand) {
            for (int anInt : ints) {
                if (0 <= anInt && anInt < 7) {
                    System.out.println("11111");
                }
                if (8 <= anInt && anInt < 15) {
                    System.out.println("22222");
                }
                if (16 <= anInt && anInt < 23) {
                    System.out.println("-- | --");
                }
                if (24 <= anInt && anInt < 31) {
                    System.out.println("---------->");
                }
                if (32 <= anInt && anInt < 64) {
                    System.out.println("******");
                }
            }
        }
    }


}