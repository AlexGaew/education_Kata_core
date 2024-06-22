package Cordinates;

import Entity.*;

public class MapRender {

    public void renderMap(Map map) {
        cleanConsoleOutput();
        int pred = 0;
        int herb = 0;
        int gra = 0;
        int tr = 0;
        int rock = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            System.out.println(" ");
            System.out.print(" ");
            System.out.print(" ");
            for (int j = 0; j < 10; j++) {
                Entity e = map.getEntity(new Coordinates(i, j));
                if (e instanceof Predator) {
                    pred++;
                    System.out.print("      \u001B[97m" + ((Predator) e).getHealth());

                }
                if (e instanceof Herbivore) {
                    herb++;
                    System.out.print("      H");
                }
                if (e instanceof Tree) {
                    tr++;
                    System.out.print("      T");
                }
                if (e instanceof Grass) {
                    gra++;
                    System.out.print("      P");

                }
                if (e instanceof Rock) {
                    rock++;
                    System.out.print("      R");

                }
                if (e == null) {
                    System.out.print("      *");
                }
            }
        }

        System.out.println("\n" + " Хищника: " + pred + " Травоядных: " + herb + " Дерева: " + tr + " Травы: " + gra + " Скал: " + rock);
        System.out.println("----------------------------------------");
    }

    public static void cleanConsoleOutput() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}
