package game.item;


import game.utils.Type;

public class Sword extends Item {

    public Sword(String name, Type type, int attackPoints) {
        super(name, type);
        this.attackPoints = attackPoints;
    }

    private int attackPoints;

}
