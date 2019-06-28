package game.entity.item;

import game.entity.Damageable;
import game.utils.Component;

public abstract class Item extends Component implements Damageable {

    public String name;

    public Item(String name) {
        this.name = name;
    }

}
