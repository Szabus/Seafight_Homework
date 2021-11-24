package model;

public class Battlefield {

    public void battle(Ship ship1, Ship ship2) {
        int shipOneCounter = 0;
        int shipTwoCounter = 0;

        if (!ship1.getState().equals(ShipState.destroyed) && !ship2.getState().equals(ShipState.destroyed)) {
            if (ship1.getAttackPower() > ship2.getAttackPower()) {
                ship1.attack(ship2);
                shipOneCounter++;
            } else if (ship1.getAttackPower() < ship2.getAttackPower()) {
                ship2.attack(ship1);
                shipTwoCounter++;
            }
        }
        //Pirate Battle round 1
        pirateBattle(ship1, ship2, shipOneCounter, shipOneCounter);
        //Pirate Battle round 2
        pirateBattle(ship1, ship2, shipOneCounter, shipOneCounter);
        //Pirate Battle round 3
        pirateBattle(ship1, ship2, shipOneCounter, shipOneCounter);

        //Fight evaluation
        if (shipOneCounter > shipTwoCounter) {
            System.out.println("Winner is: " + ship1.getName());
        } else {
            System.out.println("Winner is: " + ship2.getName());
        }
    }


    private void pirateBattle (Ship ship1, Ship ship2, int shipOneCounter, int shipTwoCounter) {
        if (!ship1.getState().equals(ShipState.destroyed) && !ship2.getState().equals(ShipState.destroyed)) {
            int i = 0;
            try {
                while (i < ship1.getCrew().size() && i < ship2.getCrew().size()) {
                    if (ship1.getCrew().get(i).getStrength() > ship2.getCrew().get(i).getStrength()) {
                        if (randomness(ship1.getCrew().get(i))) {
                            shipTwoCounter++;
                        } else {
                            ship1.getCrew().get(i).attack(ship2.getCrew().get(i));
                            shipOneCounter++;
                        }
                    } else if (ship1.getCrew().get(i).getStrength() < ship2.getCrew().get(i).getStrength()) {
                        if (randomness(ship2.getCrew().get(i))) {
                            shipOneCounter++;
                        } else {
                            ship2.getCrew().get(i).attack(ship1.getCrew().get(i));
                            shipOneCounter++;
                        }
                    }
                    i++;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("cica");
            }
        }
    }

    private boolean randomness(Pirate pirate) {
        if (pirate.getDrunkLevel() > 7) {
            return true;
        }
        return false;
    }
}

