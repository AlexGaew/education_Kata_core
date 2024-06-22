
import Cordinates.*;
import Entity.*;


public class Action {

    final String[] TURNACTIONS = {"goAllCreature", "goPredator", "goHerbivore"};
    final String INITACTIONS = "setEntityToMap";
    Map map;
    MapRender mapRender;

    public Action(Map map, MapRender mapRender) {
        this.map = map;
        this.mapRender = mapRender;
    }


//    public boolean creatureSee() {
//        Entity creature = this.map.getNextEntity(this.coordinates);
//        return creature == null;
//
//    }

    void actionSimulation() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Coordinates coordinates = new Coordinates(i, j);
                Entity entity = map.getEntity(coordinates);
                if (entity != null) {
                    switch (entity.getClass().getSimpleName()) {
                        case "Predator" -> {
                            Predator predator = (Predator) entity;
                            predator.makeMove(map, predator, coordinates);
                            mapRender.renderMap(map);
                        }
                        case "Herbivore" -> {
                            Herbivore herbivore = (Herbivore) entity;
                            herbivore.makeMove(map, herbivore, coordinates);
                            mapRender.renderMap(map);
                        }
                        default -> System.out.println(" ");
                    }

                }
            }

        }


    }


}
