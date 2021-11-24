package module;

import model.*;
import utils.*;

import java.util.List;

public class Tortuga {

    private static List<String> nameList = DocReader.nameReader("pirateNames.txt");

    private static Pirate recruit() {
        Pirate newPirate = new Pirate(
                nameList.get(utils.randomGenerator().nextInt(nameList.size())),
                utils.randomGenerator().nextInt(30),
                utils.randomGenerator().nextInt(10)
        );
        return newPirate;
    }

    public static Captain recruit(String shipName) {
        Captain newCaptain = new Captain(
                nameList.get(utils.randomGenerator().nextInt(nameList.size())),
                utils.randomGenerator().nextInt(50),
                utils.randomGenerator().nextInt(10),
                makeShip(shipName),
                utils.randomGenerator().nextInt(1000)
        );
        return newCaptain;
    }

    private static Ship makeShip(String shipName) {
        Ship newShip = new Ship(
                shipName,
                utils.randomGenerator().nextInt(100)
        );

        return newShip;
    }

    public static Captain loadShip(Captain captain) {
        captain.getShip().getCrew().add(captain);
        for (int i = 0; i < captain.getRumOwned() / 10; i++) {
            captain.getShip().getCrew().add(recruit());
        }
        return captain;
    }
}
