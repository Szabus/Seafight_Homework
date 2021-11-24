package model;

public class Pirate {
    String name;
    Integer strength;
    Integer drunkLevel;
    boolean canFight = true;

    public Pirate() {
    }

    public Pirate(String name, Integer strength, Integer drunkLevel) {
        this.name = name;
        this.strength = strength;
        this.drunkLevel = drunkLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDrunkLevel() {
        return drunkLevel;
    }

    public void setDrunkLevel(Integer drunkLevel) {
        this.drunkLevel = drunkLevel;
    }

    public boolean isCanFight() {
        return canFight;
    }

    public void setCanFight(boolean canFight) {
        this.canFight = canFight;
    }

    public void attack(Pirate enemy) {
        enemy.setCanFight(false);
    }
}
