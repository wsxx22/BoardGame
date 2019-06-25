package game.board.entity.item;

public class Shield extends Item {

    private int defensivePoints;

    public Shield(String name, int defensivePoints) {
        super(name);
        this.defensivePoints = defensivePoints;
    }
}
