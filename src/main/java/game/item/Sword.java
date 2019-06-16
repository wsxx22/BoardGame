package game.item;

public class Sword extends Item {

    private int attackPoints;

    public Sword(String name, int attackPoints) {
        super(name);
        this.attackPoints = attackPoints;
    }

}
