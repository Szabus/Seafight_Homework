package model;

public class Captain extends Pirate {
    private Ship ship;
    private Integer rumOwned;

    public Captain(String name, Integer strength, Integer drunkLevel, Ship ship, Integer rumOwned) {
        super("captain" + name, strength, drunkLevel);
        this.ship = ship;
        this.rumOwned = rumOwned;
    }


    public Integer getRumOwned() {
        return rumOwned;
    }

    public void setRumOwned(Integer rumOwned) {
        this.rumOwned = rumOwned;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void attack(Pirate enemy) {
        enemy.setCanFight(false);
        this.getShip().getCrew().get(utils.utils.randomGenerator().nextInt(this.getShip().getCrew().size())).setCanFight(true);
    }
}
