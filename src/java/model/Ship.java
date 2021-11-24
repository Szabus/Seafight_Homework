package model;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private String name;
    private Integer attackPower;
    private ShipState state = ShipState.healthy;
    private List<Pirate> crew = new ArrayList<>();


    public Ship(String name, Integer attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public void attack(Ship enemyShip) {
        if (enemyShip.getState().equals(ShipState.damaged)) {
            enemyShip.setState(ShipState.destroyed);
        } else {
            enemyShip.setState(ShipState.damaged);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public ShipState getState() {
        return state;
    }

    public void setState(ShipState state) {
        this.state = state;
    }

    public List<Pirate> getCrew() {
        return crew;
    }

    public void setCrew(List<Pirate> crew) {
        this.crew = crew;
    }
}
