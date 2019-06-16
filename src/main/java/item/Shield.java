package item;

import utils.Type;

public class Shield extends Item {

    public Shield(String name, Type type, int defensivePoints) {
        super(name, type);
        this.defensivePoints = defensivePoints;
    }

    private int defensivePoints;
}
